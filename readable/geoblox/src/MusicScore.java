/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicScore extends IntrusiveNode {
    IntrusiveNodeHashTable instrumentNoteMasks;
    byte[] midiBytes;

    final static MusicScore loadNamedScore(ResourceArchive archive, String groupName, String fileName) {
        byte[] packedScore = archive.getNamedFile(0, fileName, groupName);
        if (packedScore == null) {
            return null;
        }
        return new MusicScore(new ByteArrayBuffer(packedScore));
    }

    final void collectInstrumentNotes() {
        int[] channelBanks;
        int[] channelPrograms;
        MidiTrackReader midiReader;
        int trackCount;
        int trackIndex;
        int tickGroup;
        int packedEvent;
        int eventStatus;
        int channelIndex;
        int controllerOrProgramOrNote;
        int controllerValueOrVelocity;
        int instrumentId;
        InstrumentNoteMask noteMask;
        int[] channelProgramsAlias;
        int[] channelBanksAlias;
        int[] channelProgramsStorage;
        int[] channelBanksStorage;
        int[] channelBanksInitializationAlias;
        int trackIndexPhase2;
        if (this.instrumentNoteMasks != null) {
          return;
        }
        this.instrumentNoteMasks = new IntrusiveNodeHashTable(16);
        channelBanksStorage = new int[16];
        channelBanksAlias = channelBanksStorage;
        channelBanks = channelBanksAlias;
        channelProgramsStorage = new int[16];
        channelProgramsAlias = channelProgramsStorage;
        channelPrograms = channelProgramsAlias;
        channelBanksInitializationAlias = channelBanks;
        channelProgramsStorage[9] = 128;
        channelBanksInitializationAlias[9] = 128;
        midiReader = new MidiTrackReader(this.midiBytes);
        trackCount = midiReader.getTrackCount();
        for (trackIndex = 0; trackIndex < trackCount; trackIndex++) {
          midiReader.seekTrack(trackIndex);
          midiReader.readTrackDelta(trackIndex);
          midiReader.saveTrackPosition(trackIndex);
        }
        while (true) {
          trackIndexPhase2 = midiReader.selectEarliestTrack();
          tickGroup = midiReader.trackTicks[trackIndexPhase2];
          while (true) {
            if (midiReader.trackTicks[trackIndexPhase2] != tickGroup) {
              break;
            }
            midiReader.seekTrack(trackIndexPhase2);
            packedEvent = midiReader.readTrackEvent(trackIndexPhase2);
            if (packedEvent == 1) {
              midiReader.markCurrentTrackEnded();
              midiReader.saveTrackPosition(trackIndexPhase2);
              if (midiReader.areAllTracksEnded()) {
                return;
              }
              break;
            }
            eventStatus = packedEvent & 240;
            if (eventStatus == 176) {
              channelIndex = packedEvent & 15;
              controllerOrProgramOrNote = packedEvent >> 8 & 127;
              controllerValueOrVelocity = packedEvent >> 16 & 127;
              if (controllerOrProgramOrNote == 0) {
                channelBanks[channelIndex] = (channelBanksStorage[channelIndex] & -2080769) + (controllerValueOrVelocity << 14);
              }
              if (controllerOrProgramOrNote == 32) {
                channelBanks[channelIndex] = (channelBanksStorage[channelIndex] & -16257) + (controllerValueOrVelocity << 7);
              }
            }
            if (eventStatus == 192) {
              channelIndex = packedEvent & 15;
              controllerOrProgramOrNote = packedEvent >> 8 & 127;
              channelPrograms[channelIndex] = channelBanksStorage[channelIndex] + controllerOrProgramOrNote;
            }
            if (eventStatus == 144) {
              channelIndex = packedEvent & 15;
              controllerOrProgramOrNote = packedEvent >> 8 & 127;
              controllerValueOrVelocity = packedEvent >> 16 & 127;
              if (controllerValueOrVelocity > 0) {
                instrumentId = channelProgramsStorage[channelIndex];
                noteMask = (InstrumentNoteMask) ((Object) this.instrumentNoteMasks.findByKey((long)instrumentId, (byte) -76));
                if (noteMask == null) {
                  noteMask = new InstrumentNoteMask(new byte[128]);
                  this.instrumentNoteMasks.put((byte) 102, noteMask, (long)instrumentId);
                }
                noteMask.notesUsed[controllerOrProgramOrNote] = (byte) 1;
              }
            }
            midiReader.readTrackDelta(trackIndexPhase2);
            midiReader.saveTrackPosition(trackIndexPhase2);
          }
        }
    }

    private MusicScore(ByteArrayBuffer packedInput) {
        int eventReadIndex = 0;
        int tempoFirstByteReadIndex = 0;
        int tempoSecondByteReadIndex = 0;
        int tempoThirdByteReadIndex = 0;
        int noteOnNoteReadIndex = 0;
        int noteOnVelocityReadIndex = 0;
        int noteOffNoteReadIndex = 0;
        int noteOffVelocityReadIndex = 0;
        int pitchLowReadIndex = 0;
        int pitchHighReadIndex = 0;
        int channelPressureReadIndex = 0;
        int programReadIndex = 0;
        int polyPressureNoteReadIndex = 0;
        int polyPressureValueReadIndex = 0;
        int controllerReadIndex = 0;
        int controller1ReadIndex = 0;
        int controller33ReadIndex = 0;
        int controller7ReadIndex = 0;
        int controller39ReadIndex = 0;
        int controller10ReadIndex = 0;
        int controller42ReadIndex = 0;
        int controller99ReadIndex = 0;
        int controller98ReadIndex = 0;
        int controller101ReadIndex = 0;
        int controller100ReadIndex = 0;
        int otherControllerReadIndex = 0;
        int switchControllerReadIndex = 0;
        int bankControllerReadIndex = 0;
        ByteArrayBuffer midiHeaderOutput = null;
        int midiFormat = 0;
        int statusChangedCarrier = 0;
        int trackCount;
        int tickDivision;
        int midiByteCount;
        int tempoEventCount;
        int controllerEventCount;
        int noteOnEventCount;
        int noteOffEventCount;
        int pitchEventCount;
        int channelPressureEventCount;
        int polyPressureEventCount;
        int programAndBankValueCount;
        int trackIndexOrDeltaStart;
        int previousEventKindOrDeltaCount;
        int eventCodeOrControllerCursor;
        int controller1Count;
        int controller33Count;
        int controller7Count;
        int controller39Count;
        int controller10Count;
        int controller42Count;
        int controller99Count;
        int controller98Count;
        int controller101Count;
        int controller100Count;
        int switchControllerCount;
        int otherControllerCount;
        int controllerNumber;
        int controllerIndexOrEventCursor;
        int switchControllerCursor;
        int polyPressureCursor;
        int channelPressureCursor;
        int pitchHighCursor;
        int controller1Cursor;
        int controller7Cursor;
        int controller10Cursor;
        int noteDeltaCursor;
        int noteOnVelocityCursor;
        int otherControllerCursor;
        int noteOffVelocityCursor;
        int controller33Cursor;
        int controller39Cursor;
        int controller42Cursor;
        int programAndBankCursor;
        int pitchLowCursor;
        int controller99Cursor;
        int controller98Cursor;
        int controller101Cursor;
        int controller100Cursor;
        int tempoCursor;
        ByteArrayBuffer midiOutput;
        int channelNumber;
        int noteNumber;
        int noteOnVelocity;
        int noteOffVelocity;
        int pitchValue;
        int channelPressure;
        int polyPressure;
        int outputTrackIndex;
        int trackBodyStart;
        int previousOutputEventKind;
        int deltaTicks;
        int packedEventCode;
        int statusChanged;
        int controllerValueOrDelta;
        int[] controllerValues;
        int trackIndexOrDeltaStartPhase2;
        int previousEventKindOrDeltaCountPhase2;
        int eventCodeOrControllerCursorPhase2;
        int eventCodeOrControllerCursorPhase3;
        int controllerNumberPhase2;
        int controllerIndexOrEventCursorPhase2;
        packedInput.position = packedInput.bytes.length - 3;
        trackCount = packedInput.readUnsignedByte((byte) 34);
        tickDivision = packedInput.readUnsignedShortBE(true);
        midiByteCount = 14 + trackCount * 10;
        packedInput.position = 0;
        tempoEventCount = 0;
        controllerEventCount = 0;
        noteOnEventCount = 0;
        noteOffEventCount = 0;
        pitchEventCount = 0;
        channelPressureEventCount = 0;
        polyPressureEventCount = 0;
        programAndBankValueCount = 0;
        trackIndexOrDeltaStart = 0;
        while (trackIndexOrDeltaStart < trackCount) {
          previousEventKindOrDeltaCount = -1;
          while (true) {
            eventCodeOrControllerCursor = packedInput.readUnsignedByte((byte) 34);
            if (eventCodeOrControllerCursor != previousEventKindOrDeltaCount) {
              midiByteCount++;
            }
            previousEventKindOrDeltaCount = eventCodeOrControllerCursor & 15;
            if (eventCodeOrControllerCursor == 7) {
              trackIndexOrDeltaStart++;
              break;
            }
            if (eventCodeOrControllerCursor == 23) {
              tempoEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 0) {
              noteOnEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 1) {
              noteOffEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 2) {
              controllerEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 3) {
              pitchEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 4) {
              channelPressureEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount == 5) {
              polyPressureEventCount++;
              continue;
            }
            if (previousEventKindOrDeltaCount != 6) {
              throw new RuntimeException();
            }
            programAndBankValueCount++;
          }
        }
        midiByteCount = midiByteCount + 5 * tempoEventCount;
        midiByteCount = midiByteCount + 2 * (noteOnEventCount + noteOffEventCount + controllerEventCount + pitchEventCount + polyPressureEventCount);
        midiByteCount = midiByteCount + (channelPressureEventCount + programAndBankValueCount);
        trackIndexOrDeltaStartPhase2 = packedInput.position;
        previousEventKindOrDeltaCountPhase2 = trackCount + tempoEventCount + controllerEventCount + noteOnEventCount + noteOffEventCount + pitchEventCount + channelPressureEventCount + polyPressureEventCount + programAndBankValueCount;
        for (eventCodeOrControllerCursorPhase2 = 0; eventCodeOrControllerCursorPhase2 < previousEventKindOrDeltaCountPhase2; eventCodeOrControllerCursorPhase2++) {
          packedInput.readVariableIntBE((byte) -110);
        }
        midiByteCount = midiByteCount + (packedInput.position - trackIndexOrDeltaStartPhase2);
        eventCodeOrControllerCursorPhase3 = packedInput.position;
        controller1Count = 0;
        controller33Count = 0;
        controller7Count = 0;
        controller39Count = 0;
        controller10Count = 0;
        controller42Count = 0;
        controller99Count = 0;
        controller98Count = 0;
        controller101Count = 0;
        controller100Count = 0;
        switchControllerCount = 0;
        otherControllerCount = 0;
        controllerNumber = 0;
        for (controllerIndexOrEventCursor = 0; controllerIndexOrEventCursor < controllerEventCount; controllerIndexOrEventCursor++) {
          controllerNumber = controllerNumber + packedInput.readUnsignedByte((byte) 34) & 127;
          if (controllerNumber == 0) {
            programAndBankValueCount++;
            continue;
          }
          if (controllerNumber == 32) {
            programAndBankValueCount++;
            continue;
          }
          if (controllerNumber == 1) {
            controller1Count++;
            continue;
          }
          if (controllerNumber == 33) {
            controller33Count++;
            continue;
          }
          if (controllerNumber == 7) {
            controller7Count++;
            continue;
          }
          if (controllerNumber == 39) {
            controller39Count++;
            continue;
          }
          if (controllerNumber == 10) {
            controller10Count++;
            continue;
          }
          if (controllerNumber == 42) {
            controller42Count++;
            continue;
          }
          if (controllerNumber == 99) {
            controller99Count++;
            continue;
          }
          if (controllerNumber == 98) {
            controller98Count++;
            continue;
          }
          if (controllerNumber == 101) {
            controller101Count++;
            continue;
          }
          if (controllerNumber == 100) {
            controller100Count++;
            continue;
          }
          if (controllerNumber == 64) {
            switchControllerCount++;
            continue;
          }
          if (controllerNumber == 65) {
            switchControllerCount++;
            continue;
          }
          if (controllerNumber == 120) {
            switchControllerCount++;
            continue;
          }
          if (controllerNumber == 121) {
            switchControllerCount++;
            continue;
          }
          if (controllerNumber != 123) {
            otherControllerCount++;
            continue;
          }
          switchControllerCount++;
        }
        controllerIndexOrEventCursorPhase2 = 0;
        switchControllerCursor = packedInput.position;
        packedInput.position = packedInput.position + switchControllerCount;
        polyPressureCursor = packedInput.position;
        packedInput.position = packedInput.position + polyPressureEventCount;
        channelPressureCursor = packedInput.position;
        packedInput.position = packedInput.position + channelPressureEventCount;
        pitchHighCursor = packedInput.position;
        packedInput.position = packedInput.position + pitchEventCount;
        controller1Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller1Count;
        controller7Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller7Count;
        controller10Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller10Count;
        noteDeltaCursor = packedInput.position;
        packedInput.position = packedInput.position + (noteOnEventCount + noteOffEventCount + polyPressureEventCount);
        noteOnVelocityCursor = packedInput.position;
        packedInput.position = packedInput.position + noteOnEventCount;
        otherControllerCursor = packedInput.position;
        packedInput.position = packedInput.position + otherControllerCount;
        noteOffVelocityCursor = packedInput.position;
        packedInput.position = packedInput.position + noteOffEventCount;
        controller33Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller33Count;
        controller39Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller39Count;
        controller42Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller42Count;
        programAndBankCursor = packedInput.position;
        packedInput.position = packedInput.position + programAndBankValueCount;
        pitchLowCursor = packedInput.position;
        packedInput.position = packedInput.position + pitchEventCount;
        controller99Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller99Count;
        controller98Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller98Count;
        controller101Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller101Count;
        controller100Cursor = packedInput.position;
        packedInput.position = packedInput.position + controller100Count;
        tempoCursor = packedInput.position;
        packedInput.position = packedInput.position + tempoEventCount * 3;
        this.midiBytes = new byte[midiByteCount];
        midiOutput = new ByteArrayBuffer(this.midiBytes);
        midiOutput.writeIntBE((byte) 95, 1297377380);
        midiOutput.writeIntBE((byte) 95, 6);
        midiHeaderOutput = midiOutput;
        if (trackCount <= 1) {
          midiFormat = 0;
        } else {
          midiFormat = 1;
        }
        ((ByteArrayBuffer) (Object) midiHeaderOutput).writeShortBE(midiFormat, 28695);
        midiOutput.writeShortBE(trackCount, 28695);
        midiOutput.writeShortBE(tickDivision, 28695);
        packedInput.position = trackIndexOrDeltaStartPhase2;
        channelNumber = 0;
        noteNumber = 0;
        noteOnVelocity = 0;
        noteOffVelocity = 0;
        pitchValue = 0;
        channelPressure = 0;
        polyPressure = 0;
        controllerValues = new int[128];
        controllerNumberPhase2 = 0;
        outputTrackIndex = 0;
        while (true) {
          if (outputTrackIndex >= trackCount) {
            return;
          }
          midiOutput.writeIntBE((byte) 95, 1297379947);
          midiOutput.position = midiOutput.position + 4;
          trackBodyStart = midiOutput.position;
          previousOutputEventKind = -1;
          while (true) {
            deltaTicks = packedInput.readVariableIntBE((byte) -125);
            midiOutput.writeVariableIntBE((byte) -118, deltaTicks);
            eventReadIndex = controllerIndexOrEventCursorPhase2;
            controllerIndexOrEventCursorPhase2++;
            packedEventCode = packedInput.bytes[eventReadIndex] & 255;
            statusChangedCarrier = (packedEventCode == previousOutputEventKind) ? 0 : 1;
            statusChanged = statusChangedCarrier;
            previousOutputEventKind = packedEventCode & 15;
            if (packedEventCode == 7) {
              if (statusChanged != 0) {
                midiOutput.writeByte((byte) 123, 255);
              }
              midiOutput.writeByte((byte) 124, 47);
              midiOutput.writeByte((byte) 125, 0);
              midiOutput.backpatchLengthIntBE(midiOutput.position - trackBodyStart, 0);
              outputTrackIndex++;
              break;
            }
            if (packedEventCode == 23) {
              if (statusChanged != 0) {
                midiOutput.writeByte((byte) 126, 255);
              }
              midiOutput.writeByte((byte) -22, 81);
              midiOutput.writeByte((byte) 121, 3);
              tempoFirstByteReadIndex = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte((byte) -79, (int) packedInput.bytes[tempoFirstByteReadIndex]);
              tempoSecondByteReadIndex = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte((byte) 125, (int) packedInput.bytes[tempoSecondByteReadIndex]);
              tempoThirdByteReadIndex = tempoCursor;
              tempoCursor++;
              midiOutput.writeByte((byte) -75, (int) packedInput.bytes[tempoThirdByteReadIndex]);
              continue;
            }
            channelNumber = channelNumber ^ packedEventCode >> 4;
            if (previousOutputEventKind == 0) {
              if (statusChanged != 0) {
                midiOutput.writeByte((byte) -100, 144 + channelNumber);
              }
              noteOnNoteReadIndex = noteDeltaCursor;
              noteDeltaCursor++;
              noteNumber = noteNumber + packedInput.bytes[noteOnNoteReadIndex];
              noteOnVelocityReadIndex = noteOnVelocityCursor;
              noteOnVelocityCursor++;
              noteOnVelocity = noteOnVelocity + packedInput.bytes[noteOnVelocityReadIndex];
              midiOutput.writeByte((byte) -97, noteNumber & 127);
              midiOutput.writeByte((byte) -56, noteOnVelocity & 127);
              continue;
            }
            if (previousOutputEventKind == 1) {
              if (statusChanged != 0) {
                midiOutput.writeByte((byte) 124, 128 + channelNumber);
              }
              noteOffNoteReadIndex = noteDeltaCursor;
              noteDeltaCursor++;
              noteNumber = noteNumber + packedInput.bytes[noteOffNoteReadIndex];
              noteOffVelocityReadIndex = noteOffVelocityCursor;
              noteOffVelocityCursor++;
              noteOffVelocity = noteOffVelocity + packedInput.bytes[noteOffVelocityReadIndex];
              midiOutput.writeByte((byte) -63, noteNumber & 127);
              midiOutput.writeByte((byte) 125, noteOffVelocity & 127);
              continue;
            }
            if (previousOutputEventKind != 2) {
              if (previousOutputEventKind == 3) {
                if (statusChanged != 0) {
                  midiOutput.writeByte((byte) -8, 224 + channelNumber);
                }
                pitchLowReadIndex = pitchLowCursor;
                pitchLowCursor++;
                pitchValue = pitchValue + packedInput.bytes[pitchLowReadIndex];
                pitchHighReadIndex = pitchHighCursor;
                pitchHighCursor++;
                pitchValue = pitchValue + (packedInput.bytes[pitchHighReadIndex] << 7);
                midiOutput.writeByte((byte) -62, pitchValue & 127);
                midiOutput.writeByte((byte) 122, pitchValue >> 7 & 127);
                continue;
              }
              if (previousOutputEventKind == 4) {
                if (statusChanged != 0) {
                  midiOutput.writeByte((byte) 7, 208 + channelNumber);
                }
                channelPressureReadIndex = channelPressureCursor;
                channelPressureCursor++;
                channelPressure = channelPressure + packedInput.bytes[channelPressureReadIndex];
                midiOutput.writeByte((byte) -44, channelPressure & 127);
                continue;
              }
              if (previousOutputEventKind != 5) {
                if (previousOutputEventKind != 6) {
                  throw new RuntimeException();
                }
                if (statusChanged != 0) {
                  midiOutput.writeByte((byte) -54, 192 + channelNumber);
                }
                programReadIndex = programAndBankCursor;
                programAndBankCursor++;
                midiOutput.writeByte((byte) 121, (int) packedInput.bytes[programReadIndex]);
                continue;
              }
              if (statusChanged != 0) {
                midiOutput.writeByte((byte) 122, 160 + channelNumber);
              }
              polyPressureNoteReadIndex = noteDeltaCursor;
              noteDeltaCursor++;
              noteNumber = noteNumber + packedInput.bytes[polyPressureNoteReadIndex];
              polyPressureValueReadIndex = polyPressureCursor;
              polyPressureCursor++;
              polyPressure = polyPressure + packedInput.bytes[polyPressureValueReadIndex];
              midiOutput.writeByte((byte) -18, noteNumber & 127);
              midiOutput.writeByte((byte) 124, polyPressure & 127);
              continue;
            }
            if (statusChanged != 0) {
              midiOutput.writeByte((byte) -19, 176 + channelNumber);
            }
            controllerReadIndex = eventCodeOrControllerCursorPhase3;
            eventCodeOrControllerCursorPhase3++;
            controllerNumberPhase2 = controllerNumberPhase2 + packedInput.bytes[controllerReadIndex] & 127;
            midiOutput.writeByte((byte) 126, controllerNumberPhase2);
            if (controllerNumberPhase2 != 0 &&
                controllerNumberPhase2 != 32) {
              if (controllerNumberPhase2 == 1) {
                controller1ReadIndex = controller1Cursor;
                controller1Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller1ReadIndex];
              } else if (controllerNumberPhase2 == 33) {
                controller33ReadIndex = controller33Cursor;
                controller33Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller33ReadIndex];
              } else if (controllerNumberPhase2 == 7) {
                controller7ReadIndex = controller7Cursor;
                controller7Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller7ReadIndex];
              } else if (controllerNumberPhase2 == 39) {
                controller39ReadIndex = controller39Cursor;
                controller39Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller39ReadIndex];
              } else if (controllerNumberPhase2 == 10) {
                controller10ReadIndex = controller10Cursor;
                controller10Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller10ReadIndex];
              } else if (controllerNumberPhase2 == 42) {
                controller42ReadIndex = controller42Cursor;
                controller42Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller42ReadIndex];
              } else if (controllerNumberPhase2 == 99) {
                controller99ReadIndex = controller99Cursor;
                controller99Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller99ReadIndex];
              } else if (controllerNumberPhase2 == 98) {
                controller98ReadIndex = controller98Cursor;
                controller98Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller98ReadIndex];
              } else if (controllerNumberPhase2 == 101) {
                controller101ReadIndex = controller101Cursor;
                controller101Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller101ReadIndex];
              } else if (controllerNumberPhase2 == 100) {
                controller100ReadIndex = controller100Cursor;
                controller100Cursor++;
                controllerValueOrDelta = packedInput.bytes[controller100ReadIndex];
              } else if (controllerNumberPhase2 != 64 &&
                  controllerNumberPhase2 != 65 &&
                  controllerNumberPhase2 != 120 &&
                  controllerNumberPhase2 != 121 &&
                  controllerNumberPhase2 != 123) {
                otherControllerReadIndex = otherControllerCursor;
                otherControllerCursor++;
                controllerValueOrDelta = packedInput.bytes[otherControllerReadIndex];
              } else {
                switchControllerReadIndex = switchControllerCursor;
                switchControllerCursor++;
                controllerValueOrDelta = packedInput.bytes[switchControllerReadIndex];
              }
            } else {
              bankControllerReadIndex = programAndBankCursor;
              programAndBankCursor++;
              controllerValueOrDelta = packedInput.bytes[bankControllerReadIndex];
            }
            controllerValueOrDelta = controllerValueOrDelta + controllerValues[controllerNumberPhase2];
            controllerValues[controllerNumberPhase2] = controllerValueOrDelta;
            midiOutput.writeByte((byte) -10, controllerValueOrDelta & 127);
          }
        }
    }

    final void clearInstrumentNotes() {
        this.instrumentNoteMasks = null;
    }
}
