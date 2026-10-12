/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicTrack extends IntrusiveNode {
    byte[] midiBytes;
    NodeHashTable patchUsage;

    final void buildPatchUsage() {
        int[] channelBanks;
        int[] channelPatches;
        MidiFileReader reader;
        int trackCount;
        int trackIndex;
        int tick;
        int message;
        int statusType;
        int controlChannel;
        int controller;
        int controlValue;
        int patchId;
        MusicPatchUsage usage;
        int[] channelPatchesAlias;
        int[] channelBanksAlias;
        int[] patchBuffer;
        int[] bankBuffer;
        int[] percussionBanks;
        int selectedTrack;
        int programChannel;
        int noteChannel;
        int program;
        int note;
        int velocity;
        if (this.patchUsage != null) {
          return;
        }
        this.patchUsage = new NodeHashTable(16);
        bankBuffer = new int[16];
        channelBanksAlias = bankBuffer;
        channelBanks = channelBanksAlias;
        patchBuffer = new int[16];
        channelPatchesAlias = patchBuffer;
        channelPatches = channelPatchesAlias;
        percussionBanks = channelBanks;
        patchBuffer[9] = 128;
        percussionBanks[9] = 128;
        reader = new MidiFileReader(this.midiBytes);
        trackCount = reader.trackCount();
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          reader.seekTrack(trackIndex);
          reader.readDelta(trackIndex);
          reader.saveTrackPosition(trackIndex);
        }
        while (true) {
          selectedTrack = reader.nextTrack();
          tick = reader.trackTicks[selectedTrack];
          while (true) {
            if (reader.trackTicks[selectedTrack] != tick) {
              break;
            }
            reader.seekTrack(selectedTrack);
            message = reader.readMessage(selectedTrack);
            if (message == 1) {
              reader.markTrackDone();
              reader.saveTrackPosition(selectedTrack);
              if (reader.isDone()) {
                return;
              }
              break;
            }
            statusType = message & 240;
            if (statusType == 176) {
              controlChannel = message & 15;
              controller = message >> 8 & 127;
              controlValue = message >> 16 & 127;
              if (controller == 0) {
                channelBanks[controlChannel] = (bankBuffer[controlChannel] & -2080769) + (controlValue << 14);
              }
              if (controller == 32) {
                channelBanks[controlChannel] = (bankBuffer[controlChannel] & -16257) + (controlValue << 7);
              }
            }
            if (statusType == 192) {
              programChannel = message & 15;
              program = message >> 8 & 127;
              channelPatches[programChannel] = bankBuffer[programChannel] + program;
            }
            if (statusType == 144) {
              noteChannel = message & 15;
              note = message >> 8 & 127;
              velocity = message >> 16 & 127;
              if (velocity > 0) {
                patchId = patchBuffer[noteChannel];
                usage = (MusicPatchUsage) (this.patchUsage.get(-111, (long)patchId));
                if (usage == null) {
                  usage = new MusicPatchUsage(new byte[128]);
                  this.patchUsage.put(usage, (long)patchId, 37);
                }
                usage.notes[note] = (byte) 1;
              }
            }
            reader.readDelta(selectedTrack);
            reader.saveTrackPosition(selectedTrack);
          }
        }
    }

    final void releasePatchUsage() {
        this.patchUsage = null;
    }

    private MusicTrack(PacketBuffer packedInput) {
        int opcodeIndex1 = 0;
        int tempoIndex1 = 0;
        int tempoIndex2 = 0;
        int tempoIndex3 = 0;
        int noteIndex2 = 0;
        int noteOnVelocityIndex1 = 0;
        int noteIndex3 = 0;
        int noteOffVelocityIndex1 = 0;
        int pitchLsbIndex1 = 0;
        int pitchMsbIndex1 = 0;
        int channelPressureIndex1 = 0;
        int programAndBankIndex1 = 0;
        int noteIndex1 = 0;
        int polyPressureIndex1 = 0;
        int controllerNumberIndex1 = 0;
        int modulationMsbIndex1 = 0;
        int modulationLsbIndex1 = 0;
        int volumeMsbIndex1 = 0;
        int volumeLsbIndex1 = 0;
        int panMsbIndex1 = 0;
        int panLsbIndex1 = 0;
        int nrpnMsbIndex1 = 0;
        int nrpnLsbIndex1 = 0;
        int rpnMsbIndex1 = 0;
        int rpnLsbIndex1 = 0;
        int otherControlIndex1 = 0;
        int specialControlIndex1 = 0;
        int programAndBankIndex2 = 0;
        PacketBuffer headerOutput = null;
        boolean shortWriteGuard = false;
        int midiFormat = 0;
        int statusNeeded = 0;
        int trackCount;
        int division;
        int midiLength;
        int tempoCount;
        int controlCount;
        int noteOnCount;
        int noteOffCount;
        int pitchBendCount;
        int channelPressureCount;
        int polyPressureCount;
        int programAndBankCount;
        int scanTrackIndex;
        int previousOpcode;
        int packedOpcode;
        int modulationMsbCount;
        int modulationLsbCount;
        int volumeMsbCount;
        int volumeLsbCount;
        int panMsbCount;
        int panLsbCount;
        int nrpnMsbCount;
        int nrpnLsbCount;
        int rpnMsbCount;
        int rpnLsbCount;
        int specialControlCount;
        int otherControlCount;
        int controller;
        int controlScanIndex;
        int specialControlCursor;
        int polyPressureCursor;
        int channelPressureCursor;
        int pitchMsbCursor;
        int modulationMsbCursor;
        int volumeMsbCursor;
        int panMsbCursor;
        int noteCursor;
        int noteOnVelocityCursor;
        int otherControlCursor;
        int noteOffVelocityCursor;
        int modulationLsbCursor;
        int volumeLsbCursor;
        int panLsbCursor;
        int programAndBankCursor;
        int pitchLsbCursor;
        int nrpnMsbCursor;
        int nrpnLsbCursor;
        int rpnMsbCursor;
        int rpnLsbCursor;
        int tempoCursor;
        PacketBuffer midiOutput;
        int channel;
        int note;
        int noteOnVelocity;
        int noteOffVelocity;
        int pitchBend;
        int channelPressure;
        int polyPressure;
        int writeTrackIndex;
        int trackDataStart;
        int previousWrittenOpcode;
        int delta;
        int writeOpcode;
        int emitStatus;
        int controlDeltaOrValue;
        int[] controllerValues;
        int deltaStart;
        int eventCount;
        int deltaScanIndex;
        int controllerNumberCursor;
        int writtenController;
        int opcodeCursor;
        packedInput.position = packedInput.payload.length - 3;
        trackCount = packedInput.readUnsignedByte(0);
        division = packedInput.readUnsignedShort((byte) -104);
        midiLength = 14 + trackCount * 10;
        packedInput.position = 0;
        tempoCount = 0;
        controlCount = 0;
        noteOnCount = 0;
        noteOffCount = 0;
        pitchBendCount = 0;
        channelPressureCount = 0;
        polyPressureCount = 0;
        programAndBankCount = 0;
        scanTrackIndex = 0;
        while (scanTrackIndex < trackCount) {
          previousOpcode = -1;
          while (true) {
            packedOpcode = packedInput.readUnsignedByte(0);
            if (packedOpcode != previousOpcode) {
              midiLength++;
            }
            previousOpcode = packedOpcode & 15;
            if (packedOpcode == 7) {
              scanTrackIndex++;
              break;
            }
            if (packedOpcode == 23) {
              tempoCount++;
              continue;
            }
            if (previousOpcode == 0) {
              noteOnCount++;
              continue;
            }
            if (previousOpcode == 1) {
              noteOffCount++;
              continue;
            }
            if (previousOpcode == 2) {
              controlCount++;
              continue;
            }
            if (previousOpcode == 3) {
              pitchBendCount++;
              continue;
            }
            if (previousOpcode == 4) {
              channelPressureCount++;
              continue;
            }
            if (previousOpcode == 5) {
              polyPressureCount++;
              continue;
            }
            if (previousOpcode != 6) {
              throw new RuntimeException();
            }
            programAndBankCount++;
          }
        }
        midiLength = midiLength + 5 * tempoCount;
        midiLength = midiLength + 2 * (noteOnCount + noteOffCount + controlCount + pitchBendCount + polyPressureCount);
        midiLength = midiLength + (channelPressureCount + programAndBankCount);
        deltaStart = packedInput.position;
        eventCount = trackCount + tempoCount + controlCount + noteOnCount + noteOffCount + pitchBendCount + channelPressureCount + polyPressureCount + programAndBankCount;
        for (deltaScanIndex = 0; deltaScanIndex < eventCount; deltaScanIndex++) {
          packedInput.readVarInt(110);
        }
        midiLength = midiLength + (packedInput.position - deltaStart);
        controllerNumberCursor = packedInput.position;
        modulationMsbCount = 0;
        modulationLsbCount = 0;
        volumeMsbCount = 0;
        volumeLsbCount = 0;
        panMsbCount = 0;
        panLsbCount = 0;
        nrpnMsbCount = 0;
        nrpnLsbCount = 0;
        rpnMsbCount = 0;
        rpnLsbCount = 0;
        specialControlCount = 0;
        otherControlCount = 0;
        controller = 0;
        for (controlScanIndex = 0; controlScanIndex < controlCount; controlScanIndex++) {
          controller = controller + packedInput.readUnsignedByte(0) & 127;
          if (controller != 0) {
            if (controller != 32) {
              if (controller != 1) {
                if (controller != 33) {
                  if (controller != 7) {
                    if (controller != 39) {
                      if (controller != 10) {
                        if (controller != 42) {
                          if (controller != 99) {
                            if (controller != 98) {
                              if (controller != 101) {
                                if (controller != 100) {
                                  if (controller != 64) {
                                    if (controller != 65) {
                                      if (controller != 120) {
                                        if (controller != 121) {
                                          if (controller != 123) {
                                            otherControlCount++;
                                          } else {
                                            specialControlCount++;
                                          }
                                        } else {
                                          specialControlCount++;
                                        }
                                      } else {
                                        specialControlCount++;
                                      }
                                    } else {
                                      specialControlCount++;
                                    }
                                  } else {
                                    specialControlCount++;
                                  }
                                } else {
                                  rpnLsbCount++;
                                }
                              } else {
                                rpnMsbCount++;
                              }
                            } else {
                              nrpnLsbCount++;
                            }
                          } else {
                            nrpnMsbCount++;
                          }
                        } else {
                          panLsbCount++;
                        }
                      } else {
                        panMsbCount++;
                      }
                    } else {
                      volumeLsbCount++;
                    }
                  } else {
                    volumeMsbCount++;
                  }
                } else {
                  modulationLsbCount++;
                }
              } else {
                modulationMsbCount++;
              }
            } else {
              programAndBankCount++;
            }
          } else {
            programAndBankCount++;
          }
        }
        opcodeCursor = 0;
        specialControlCursor = packedInput.position;
        packedInput.position = packedInput.position + specialControlCount;
        polyPressureCursor = packedInput.position;
        packedInput.position = packedInput.position + polyPressureCount;
        channelPressureCursor = packedInput.position;
        packedInput.position = packedInput.position + channelPressureCount;
        pitchMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + pitchBendCount;
        modulationMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + modulationMsbCount;
        volumeMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + volumeMsbCount;
        panMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + panMsbCount;
        noteCursor = packedInput.position;
        packedInput.position = packedInput.position + (noteOnCount + noteOffCount + polyPressureCount);
        noteOnVelocityCursor = packedInput.position;
        packedInput.position = packedInput.position + noteOnCount;
        otherControlCursor = packedInput.position;
        packedInput.position = packedInput.position + otherControlCount;
        noteOffVelocityCursor = packedInput.position;
        packedInput.position = packedInput.position + noteOffCount;
        modulationLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + modulationLsbCount;
        volumeLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + volumeLsbCount;
        panLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + panLsbCount;
        programAndBankCursor = packedInput.position;
        packedInput.position = packedInput.position + programAndBankCount;
        pitchLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + pitchBendCount;
        nrpnMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + nrpnMsbCount;
        nrpnLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + nrpnLsbCount;
        rpnMsbCursor = packedInput.position;
        packedInput.position = packedInput.position + rpnMsbCount;
        rpnLsbCursor = packedInput.position;
        packedInput.position = packedInput.position + rpnLsbCount;
        tempoCursor = packedInput.position;
        packedInput.position = packedInput.position + tempoCount * 3;
        this.midiBytes = new byte[midiLength];
        midiOutput = new PacketBuffer(this.midiBytes);
        midiOutput.writeInt((byte) -121, 1297377380);
        midiOutput.writeInt((byte) -48, 6);
        headerOutput = midiOutput;
        shortWriteGuard = true;
        if (trackCount <= 1) {
          midiFormat = 0;
        } else {
          midiFormat = 1;
        }
        ((PacketBuffer) (Object) headerOutput).writeShort(shortWriteGuard, midiFormat);
        midiOutput.writeShort(true, trackCount);
        midiOutput.writeShort(true, division);
        packedInput.position = deltaStart;
        channel = 0;
        note = 0;
        noteOnVelocity = 0;
        noteOffVelocity = 0;
        pitchBend = 0;
        channelPressure = 0;
        polyPressure = 0;
        controllerValues = new int[128];
        writtenController = 0;
        writeTrackIndex = 0;
        while (true) {
          if (writeTrackIndex >= trackCount) {
            return;
          }
          midiOutput.writeInt((byte) -54, 1297379947);
          midiOutput.position = midiOutput.position + 4;
          trackDataStart = midiOutput.position;
          previousWrittenOpcode = -1;
          while (true) {
            delta = packedInput.readVarInt(117);
            midiOutput.writeVarInt(-49, delta);
            opcodeIndex1 = opcodeCursor;
            opcodeCursor++;
            writeOpcode = packedInput.payload[opcodeIndex1] & 255;
            statusNeeded = (writeOpcode == previousWrittenOpcode) ? 0 : 1;
            emitStatus = statusNeeded;
            previousWrittenOpcode = writeOpcode & 15;
            if (writeOpcode == 7) {
              if (emitStatus != 0) {
                midiOutput.writeByte(1, 255);
              }
              midiOutput.writeByte(1, 47);
              midiOutput.writeByte(1, 0);
              midiOutput.writeIntLengthPrefix(-1, midiOutput.position - trackDataStart);
              writeTrackIndex++;
              break;
            }
            if (writeOpcode == 23) {
              if (emitStatus != 0) {
                midiOutput.writeByte(1, 255);
              }
              midiOutput.writeByte(1, 81);
              midiOutput.writeByte(1, 3);
              tempoIndex1 = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte(1, (int) packedInput.payload[tempoIndex1]);
              tempoIndex2 = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte(1, (int) packedInput.payload[tempoIndex2]);
              tempoIndex3 = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte(1, (int) packedInput.payload[tempoIndex3]);
              continue;
            }
            channel = channel ^ writeOpcode >> 4;
            if (previousWrittenOpcode == 0) {
              if (emitStatus != 0) {
                midiOutput.writeByte(1, 144 + channel);
              }
              noteIndex2 = noteCursor;
              noteCursor++;
              note = note + packedInput.payload[noteIndex2];
              noteOnVelocityIndex1 = noteOnVelocityCursor;
              noteOnVelocityCursor++;
              noteOnVelocity = noteOnVelocity + packedInput.payload[noteOnVelocityIndex1];
              midiOutput.writeByte(1, note & 127);
              midiOutput.writeByte(1, noteOnVelocity & 127);
              continue;
            }
            if (previousWrittenOpcode == 1) {
              if (emitStatus != 0) {
                midiOutput.writeByte(1, 128 + channel);
              }
              noteIndex3 = noteCursor;
              noteCursor++;
              note = note + packedInput.payload[noteIndex3];
              noteOffVelocityIndex1 = noteOffVelocityCursor;
              noteOffVelocityCursor++;
              noteOffVelocity = noteOffVelocity + packedInput.payload[noteOffVelocityIndex1];
              midiOutput.writeByte(1, note & 127);
              midiOutput.writeByte(1, noteOffVelocity & 127);
              continue;
            }
            if (previousWrittenOpcode != 2) {
              if (previousWrittenOpcode == 3) {
                if (emitStatus != 0) {
                  midiOutput.writeByte(1, 224 + channel);
                }
                pitchLsbIndex1 = pitchLsbCursor;
                pitchLsbCursor++;
                pitchBend = pitchBend + packedInput.payload[pitchLsbIndex1];
                pitchMsbIndex1 = pitchMsbCursor;
                pitchMsbCursor++;
                pitchBend = pitchBend + (packedInput.payload[pitchMsbIndex1] << 7);
                midiOutput.writeByte(1, pitchBend & 127);
                midiOutput.writeByte(1, pitchBend >> 7 & 127);
                continue;
              }
              if (previousWrittenOpcode == 4) {
                if (emitStatus != 0) {
                  midiOutput.writeByte(1, 208 + channel);
                }
                channelPressureIndex1 = channelPressureCursor;
                channelPressureCursor++;
                channelPressure = channelPressure + packedInput.payload[channelPressureIndex1];
                midiOutput.writeByte(1, channelPressure & 127);
                continue;
              }
              if (previousWrittenOpcode != 5) {
                if (previousWrittenOpcode != 6) {
                  throw new RuntimeException();
                }
                if (emitStatus != 0) {
                  midiOutput.writeByte(1, 192 + channel);
                }
                programAndBankIndex1 = programAndBankCursor;
                programAndBankCursor++;
                midiOutput.writeByte(1, (int) packedInput.payload[programAndBankIndex1]);
                continue;
              }
              if (emitStatus != 0) {
                midiOutput.writeByte(1, 160 + channel);
              }
              noteIndex1 = noteCursor;
              noteCursor++;
              note = note + packedInput.payload[noteIndex1];
              polyPressureIndex1 = polyPressureCursor;
              polyPressureCursor++;
              polyPressure = polyPressure + packedInput.payload[polyPressureIndex1];
              midiOutput.writeByte(1, note & 127);
              midiOutput.writeByte(1, polyPressure & 127);
              continue;
            }
            if (emitStatus != 0) {
              midiOutput.writeByte(1, 176 + channel);
            }
            controllerNumberIndex1 = controllerNumberCursor;
            controllerNumberCursor++;
            writtenController = writtenController + packedInput.payload[controllerNumberIndex1] & 127;
            midiOutput.writeByte(1, writtenController);
            if (writtenController != 0 &&
              writtenController != 32) {
              if (writtenController == 1) {
                modulationMsbIndex1 = modulationMsbCursor;
                modulationMsbCursor++;
                controlDeltaOrValue = packedInput.payload[modulationMsbIndex1];
              } else if (writtenController == 33) {
                modulationLsbIndex1 = modulationLsbCursor;
                modulationLsbCursor++;
                controlDeltaOrValue = packedInput.payload[modulationLsbIndex1];
              } else if (writtenController == 7) {
                volumeMsbIndex1 = volumeMsbCursor;
                volumeMsbCursor++;
                controlDeltaOrValue = packedInput.payload[volumeMsbIndex1];
              } else if (writtenController == 39) {
                volumeLsbIndex1 = volumeLsbCursor;
                volumeLsbCursor++;
                controlDeltaOrValue = packedInput.payload[volumeLsbIndex1];
              } else if (writtenController == 10) {
                panMsbIndex1 = panMsbCursor;
                panMsbCursor++;
                controlDeltaOrValue = packedInput.payload[panMsbIndex1];
              } else if (writtenController == 42) {
                panLsbIndex1 = panLsbCursor;
                panLsbCursor++;
                controlDeltaOrValue = packedInput.payload[panLsbIndex1];
              } else if (writtenController == 99) {
                nrpnMsbIndex1 = nrpnMsbCursor;
                nrpnMsbCursor++;
                controlDeltaOrValue = packedInput.payload[nrpnMsbIndex1];
              } else if (writtenController == 98) {
                nrpnLsbIndex1 = nrpnLsbCursor;
                nrpnLsbCursor++;
                controlDeltaOrValue = packedInput.payload[nrpnLsbIndex1];
              } else if (writtenController == 101) {
                rpnMsbIndex1 = rpnMsbCursor;
                rpnMsbCursor++;
                controlDeltaOrValue = packedInput.payload[rpnMsbIndex1];
              } else if (writtenController == 100) {
                rpnLsbIndex1 = rpnLsbCursor;
                rpnLsbCursor++;
                controlDeltaOrValue = packedInput.payload[rpnLsbIndex1];
              } else if (writtenController != 64 &&
                writtenController != 65 &&
                writtenController != 120 &&
                writtenController != 121 &&
                writtenController != 123) {
                otherControlIndex1 = otherControlCursor;
                otherControlCursor++;
                controlDeltaOrValue = packedInput.payload[otherControlIndex1];
              } else {
                specialControlIndex1 = specialControlCursor;
                specialControlCursor++;
                controlDeltaOrValue = packedInput.payload[specialControlIndex1];
              }
            } else {
              programAndBankIndex2 = programAndBankCursor;
              programAndBankCursor++;
              controlDeltaOrValue = packedInput.payload[programAndBankIndex2];
            }
            controlDeltaOrValue = controlDeltaOrValue + controllerValues[writtenController];
            controllerValues[writtenController] = controlDeltaOrValue;
            midiOutput.writeByte(1, controlDeltaOrValue & 127);
          }
        }
    }

    final static MusicTrack load(ResourceArchive archive, String groupName, String fileName) {
        byte[] packedBytes = archive.getFileByName(fileName, 10, groupName);
        if (packedBytes == null) {
          return null;
        }
        return new MusicTrack(new PacketBuffer(packedBytes));
    }
}
