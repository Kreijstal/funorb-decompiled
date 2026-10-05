/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedRandomAccessFile {
    private int readBufferLength;
    private long writeBufferStart;
    private int writeBufferLength;
    private long physicalLength;
    private LimitedRandomAccessFile file;
    private long logicalLength;
    private long readBufferStart;
    private byte[] writeBuffer;
    private byte[] readBuffer;
    private long underlyingPosition;
    private long position;

    private final void flush(byte methodGuard) throws IOException {
        long overlapStart;
        long overlapEnd;
        int overlapLength;
        int unusedClientGuardSnapshot;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (this.writeBufferStart != -1L) {
          if (~this.underlyingPosition != ~this.writeBufferStart) {
            this.file.seek(this.writeBufferStart, true);
            this.underlyingPosition = this.writeBufferStart;
          }
          this.file.write(this.writeBuffer, 0, 90, this.writeBufferLength);
          this.underlyingPosition = this.underlyingPosition + (long)this.writeBufferLength;
          if (~this.underlyingPosition < ~this.physicalLength) {
            this.physicalLength = this.underlyingPosition;
          }
          overlapStart = -1L;
          overlapEnd = -1L;
          if (this.writeBufferStart >= this.readBufferStart &&
              ~((long)this.readBufferLength + this.readBufferStart) < ~this.writeBufferStart) {
            overlapStart = this.writeBufferStart;
          } else {
            if (this.writeBufferStart <= this.readBufferStart &&
                ~this.readBufferStart > ~(this.writeBufferStart + (long)this.writeBufferLength)) {
              overlapStart = this.readBufferStart;
            }
          }
          if (~this.readBufferStart > ~(this.writeBufferStart + (long)this.writeBufferLength) &&
              this.readBufferStart + (long)this.readBufferLength >= (long)this.writeBufferLength + this.writeBufferStart) {
            overlapEnd = (long)this.writeBufferLength + this.writeBufferStart;
          } else {
            if (~((long)this.readBufferLength + this.readBufferStart) < ~this.writeBufferStart &&
                ~(this.writeBufferStart + (long)this.writeBufferLength) <= ~((long)this.readBufferLength + this.readBufferStart)) {
              overlapEnd = this.readBufferStart + (long)this.readBufferLength;
            }
          }
          if (overlapStart > -1L &&
              overlapEnd > overlapStart) {
            overlapLength = (int)(overlapEnd - overlapStart);
            ArrayOperations.copyBytes(this.writeBuffer, (int)(-this.writeBufferStart + overlapStart), this.readBuffer, (int)(-this.readBufferStart + overlapStart), overlapLength);
          }
          this.writeBufferLength = 0;
          this.writeBufferStart = -1L;
        }
        if (methodGuard <= 60) {
          this.physicalLength = 28L;
        }
    }

    final void close(int methodGuard) throws IOException {
        this.flush((byte) 91);
        this.file.close((byte) -5);
        if (methodGuard != 27034) {
            this.length((byte) 92);
        }
    }

    final long length(byte methodGuard) {
        if (methodGuard != 46) {
            this.readBuffer = (byte[]) null;
        }
        return this.logicalLength;
    }

    final void readFully(byte[] destination, int remainingLength, int destinationOffset, int methodGuard) throws IOException {
        int zeroFillDestinationIndex = 0;
        int zeroFillComparisonMinusOne = 0;
        int complementedRemainingLength = 0;
        RuntimeException readFailureBeforeContext = null;
        StringBuilder readMessagePrefix = null;
        String destinationDescription = null;
        Throwable caughtReadFailure = null;
        long initialPosition = 0L;
        IOException readIoFailure = null;
        RuntimeException readFailureForContext = null;
        int initialDestinationOffset = 0;
        int requestedLength = 0;
        int readCountOrZeroFillEnd = 0;
        long overlayStart = 0L;
        long overlayEnd = 0L;
        int overlayLength = 0;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          try {
            if (remainingLength + destinationOffset > destination.length) {
              throw new ArrayIndexOutOfBoundsException(-destination.length + destinationOffset + remainingLength);
            }
            if (-1L != this.writeBufferStart &&
                this.position >= this.writeBufferStart &&
                (long)this.writeBufferLength + this.writeBufferStart >= (long)remainingLength + this.position) {
              ArrayOperations.copyBytes(this.writeBuffer, (int)(-this.writeBufferStart + this.position), destination, destinationOffset, remainingLength);
              this.position = this.position + (long)remainingLength;
              return;
            }
            initialPosition = this.position;
            initialDestinationOffset = destinationOffset;
            requestedLength = remainingLength;
            if (methodGuard != 9868) {
              BufferedRandomAccessFile.checkBoundaryLossAndStartCascade(-115);
            }
            if (~this.position <= ~this.readBufferStart &&
                ~((long)this.readBufferLength + this.readBufferStart) < ~this.position) {
              readCountOrZeroFillEnd = (int)((long)this.readBufferLength - this.position + this.readBufferStart);
              if (remainingLength < readCountOrZeroFillEnd) {
                readCountOrZeroFillEnd = remainingLength;
              }
              ArrayOperations.copyBytes(this.readBuffer, (int)(-this.readBufferStart + this.position), destination, destinationOffset, readCountOrZeroFillEnd);
              remainingLength = remainingLength - readCountOrZeroFillEnd;
              this.position = this.position + (long)readCountOrZeroFillEnd;
              destinationOffset = destinationOffset + readCountOrZeroFillEnd;
            }
            underlyingReadSelection: {
              if (this.readBuffer.length < remainingLength) {
                this.file.seek(this.position, true);
                this.underlyingPosition = this.position;
                while (remainingLength > 0) {
                  readCountOrZeroFillEnd = this.file.read(remainingLength, destination, destinationOffset, false);
                  if (-1 == readCountOrZeroFillEnd) {
                    break underlyingReadSelection;
                  }
                  this.position = this.position + (long)readCountOrZeroFillEnd;
                  this.underlyingPosition = this.underlyingPosition + (long)readCountOrZeroFillEnd;
                  remainingLength = remainingLength - readCountOrZeroFillEnd;
                  destinationOffset = destinationOffset + readCountOrZeroFillEnd;
                }
                break underlyingReadSelection;
              }
              if (remainingLength > 0) {
                this.refillReadBuffer(true);
                readCountOrZeroFillEnd = remainingLength;
                if (this.readBufferLength < readCountOrZeroFillEnd) {
                  readCountOrZeroFillEnd = this.readBufferLength;
                }
                ArrayOperations.copyBytes(this.readBuffer, 0, destination, destinationOffset, readCountOrZeroFillEnd);
                remainingLength = remainingLength - readCountOrZeroFillEnd;
                destinationOffset = destinationOffset + readCountOrZeroFillEnd;
                this.position = this.position + (long)readCountOrZeroFillEnd;
              }
            }
            if (-1L != this.writeBufferStart) {
              if (~this.writeBufferStart < ~this.position) {
                zeroFillComparisonMinusOne = -1;
                complementedRemainingLength = ~remainingLength;
                if (zeroFillComparisonMinusOne > complementedRemainingLength) {
                  readCountOrZeroFillEnd = destinationOffset + (int)(-this.position + this.writeBufferStart);
                  if (destinationOffset + remainingLength < readCountOrZeroFillEnd) {
                    readCountOrZeroFillEnd = destinationOffset + remainingLength;
                  }
                  while (readCountOrZeroFillEnd > destinationOffset) {
                    remainingLength--;
                    zeroFillDestinationIndex = destinationOffset;
                    destinationOffset++;
                    destination[zeroFillDestinationIndex] = (byte) 0;
                    this.position = this.position + 1L;
                  }
                }
              }
              overlayStart = -1L;
              if (~this.writeBufferStart <= ~initialPosition &&
                  ~this.writeBufferStart > ~((long)requestedLength + initialPosition)) {
                overlayStart = this.writeBufferStart;
              } else {
                if (~this.writeBufferStart >= ~initialPosition &&
                    initialPosition < this.writeBufferStart + (long)this.writeBufferLength) {
                  overlayStart = initialPosition;
                }
              }
              overlayEnd = -1L;
              if (~initialPosition > ~((long)this.writeBufferLength + this.writeBufferStart) &&
                  (long)requestedLength + initialPosition >= (long)this.writeBufferLength + this.writeBufferStart) {
                overlayEnd = this.writeBufferStart + (long)this.writeBufferLength;
              } else {
                if (this.writeBufferStart < initialPosition + (long)requestedLength &&
                    ~(initialPosition + (long)requestedLength) >= ~(this.writeBufferStart + (long)this.writeBufferLength)) {
                  overlayEnd = (long)requestedLength + initialPosition;
                }
              }
              if (overlayStart > -1L &&
                  overlayStart < overlayEnd) {
                overlayLength = (int)(-overlayStart + overlayEnd);
                ArrayOperations.copyBytes(this.writeBuffer, (int)(overlayStart - this.writeBufferStart), destination, initialDestinationOffset + (int)(-initialPosition + overlayStart), overlayLength);
                if (overlayEnd > this.position) {
                  remainingLength = (int)((long)remainingLength - (overlayEnd - this.position));
                  this.position = overlayEnd;
                }
              }
            }
          } catch (java.io.IOException readIOException) {
            caughtReadFailure = readIOException;
            readIoFailure = (IOException) (Object) caughtReadFailure;
            this.underlyingPosition = -1L;
            throw readIoFailure;
          }
          if (remainingLength > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = (RuntimeException) (Object) caughtReadFailure;
          readFailureBeforeContext = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("sk.B(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeContext), ((StringBuilder) (Object) readMessagePrefix).append(destinationDescription).append(',').append(remainingLength).append(',').append(destinationOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void write(int remainingLength, int sourceOffset, byte[] source, boolean methodGuard) throws IOException {
        LimitedRandomAccessFile fileBeforeSeek = null;
        long positionBeforeSeek = 0L;
        boolean seekGuardBeforeCall = false;
        RuntimeException writeFailureBeforeContext = null;
        StringBuilder writeMessagePrefix = null;
        String sourceDescription = null;
        Throwable caughtWriteFailure = null;
        int bytesUntilWriteBufferFull = 0;
        long overlapStart = 0L;
        IOException writeIoFailure = null;
        RuntimeException writeFailureForContext = null;
        long overlapEnd = 0L;
        int overlapLength = 0;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          try {
            if (~this.logicalLength > ~((long)remainingLength + this.position)) {
              this.logicalLength = (long)remainingLength + this.position;
            }
            if (-1L != this.writeBufferStart) {
              if (~this.writeBufferStart >= ~this.position) {
                if (~this.position < ~(this.writeBufferStart + (long)this.writeBufferLength)) {
                  this.flush((byte) 99);
                }
              } else {
                this.flush((byte) 99);
              }
            }
            if (-1L != this.writeBufferStart &&
                (long)remainingLength + this.position > (long)this.writeBuffer.length + this.writeBufferStart) {
              bytesUntilWriteBufferFull = (int)((long)this.writeBuffer.length + this.writeBufferStart - this.position);
              ArrayOperations.copyBytes(source, sourceOffset, this.writeBuffer, (int)(-this.writeBufferStart + this.position), bytesUntilWriteBufferFull);
              this.position = this.position + (long)bytesUntilWriteBufferFull;
              sourceOffset = sourceOffset + bytesUntilWriteBufferFull;
              remainingLength = remainingLength - bytesUntilWriteBufferFull;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush((byte) 127);
            }
            if (methodGuard) {
              return;
            }
            if (remainingLength <= this.writeBuffer.length) {
              if (remainingLength <= 0) {
                return;
              }
              if (this.writeBufferStart == -1L) {
                this.writeBufferStart = this.position;
              }
              ArrayOperations.copyBytes(source, sourceOffset, this.writeBuffer, (int)(-this.writeBufferStart + this.position), remainingLength);
              this.position = this.position + (long)remainingLength;
              if (~(long)this.writeBufferLength > ~(-this.writeBufferStart + this.position)) {
                this.writeBufferLength = (int)(this.position - this.writeBufferStart);
              }
              return;
            }
            if (this.position != this.underlyingPosition) {
              fileBeforeSeek = this.file;
              positionBeforeSeek = this.position;
              seekGuardBeforeCall = !(methodGuard);
              ((LimitedRandomAccessFile) (Object) fileBeforeSeek).seek(positionBeforeSeek, seekGuardBeforeCall);
              this.underlyingPosition = this.position;
            }
            this.file.write(source, sourceOffset, 90, remainingLength);
            this.underlyingPosition = this.underlyingPosition + (long)remainingLength;
            if (~this.underlyingPosition < ~this.physicalLength) {
              this.physicalLength = this.underlyingPosition;
            }
            overlapStart = -1L;
            overlapEnd = -1L;
            if (~this.readBufferStart >= ~this.position &&
                ~this.position > ~(this.readBufferStart + (long)this.readBufferLength)) {
              overlapStart = this.position;
            } else {
              if (~this.readBufferStart <= ~this.position &&
                  ~this.readBufferStart > ~(this.position + (long)remainingLength)) {
                overlapStart = this.readBufferStart;
              }
            }
            if (~this.readBufferStart > ~((long)remainingLength + this.position) &&
                ~((long)this.readBufferLength + this.readBufferStart) <= ~(this.position + (long)remainingLength)) {
              overlapEnd = this.position + (long)remainingLength;
            } else {
              if (this.position < this.readBufferStart + (long)this.readBufferLength &&
                  ~(this.readBufferStart + (long)this.readBufferLength) >= ~(this.position + (long)remainingLength)) {
                overlapEnd = (long)this.readBufferLength + this.readBufferStart;
              }
            }
            if (overlapStart > -1L &&
                ~overlapStart > ~overlapEnd) {
              overlapLength = (int)(-overlapStart + overlapEnd);
              ArrayOperations.copyBytes(source, (int)(overlapStart + ((long)sourceOffset - this.position)), this.readBuffer, (int)(overlapStart - this.readBufferStart), overlapLength);
            }
            this.position = this.position + (long)remainingLength;
            return;
          } catch (java.io.IOException writeIOException) {
            caughtWriteFailure = writeIOException;
            writeIoFailure = (IOException) (Object) caughtWriteFailure;
            this.underlyingPosition = -1L;
            throw writeIoFailure;
          }
        } catch (java.lang.RuntimeException writeFailure) {
          caughtWriteFailure = writeFailure;
          writeFailureForContext = (RuntimeException) (Object) caughtWriteFailure;
          writeFailureBeforeContext = writeFailureForContext;
          writeMessagePrefix = new StringBuilder().append("sk.C(").append(remainingLength).append(',').append(sourceOffset).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) writeFailureBeforeContext), ((StringBuilder) (Object) writeMessagePrefix).append(sourceDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void readAll(byte methodGuard, byte[] destination) throws IOException {
        try {
            this.readFully(destination, destination.length, 0, 9868);
            int unusedReadGuardQuotient = -83 / ((methodGuard + 9) / 39);
        } catch (RuntimeException readAllFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readAllFailure), "sk.I(" + methodGuard + ',' + (destination != null ? "{...}" : "null") + ')');
        }
    }

    private final void refillReadBuffer(boolean enabled) throws IOException {
        int requestedReadLength;
        int bytesRead;
        int unusedClientGuardSnapshot;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        if (!enabled) {
          return;
        }
        this.readBufferLength = 0;
        if (~this.underlyingPosition != ~this.position) {
          this.file.seek(this.position, true);
          this.underlyingPosition = this.position;
        }
        this.readBufferStart = this.position;
        while (this.readBufferLength < this.readBuffer.length) {
          requestedReadLength = -this.readBufferLength + this.readBuffer.length;
          if (requestedReadLength > 200000000) {
            requestedReadLength = 200000000;
          }
          bytesRead = this.file.read(requestedReadLength, this.readBuffer, this.readBufferLength, false);
          if (bytesRead != -1) {
            this.readBufferLength = this.readBufferLength + bytesRead;
            this.underlyingPosition = this.underlyingPosition + (long)bytesRead;
            continue;
          }
          break;
        }
    }

    final void seek(int methodGuard, long position) throws IOException {
        if (position < 0L) {
            throw new IOException();
        }
        int unusedSeekGuardQuotient = -65 / ((-57 - methodGuard) / 37);
        this.position = position;
    }

    final static boolean checkBoundaryLossAndStartCascade(int param0) {
        RuntimeException decompiledCaughtException = null;
        GameplayEntity farthestEntity = null;
        RuntimeException var1_ref = null;
        float farthestRadiusSquared = 0.0f;
        GameplayEntity candidateEntity = null;
        SecondaryDeque visitedCascadeEntities = null;
        int staggeredLifetime = 0;
        GameplayEntity cascadeEntity = null;
        int neighborIndex = 0;
        GameplayEntity neighborEntity = null;
        GameplayEntity searchedEntity = null;
        int var10 = 0;
        GameplayEntity seedEntity = null;
        SecondaryDeque cascadeFrontier = null;
        var10 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 != -1) {
            BufferedRandomAccessFile.checkBoundaryLossAndStartCascade(3);
          }
          if (UiWidget.gameplaySession.sceneTransitionRequested) {
            return false;
          }
          LogoPreparationSupport.boardOwnershipRaster.setAsRasterTarget();
          if (!PlayfieldRules.hasPixelsAtPlayfieldBoundary(-61)) {
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            return false;
          }
          UiWidget.gameplaySession.startSessionEndSequence((byte) 116);
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
          seedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.lastForIteration(false));
          farthestEntity = seedEntity;
          farthestRadiusSquared = (-320.0f + seedEntity.positionX) * (-320.0f + seedEntity.positionX) + (seedEntity.positionY - 240.0f) * (seedEntity.positionY - 240.0f);
          candidateEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.lastForIteration(false));
          while (candidateEntity != null) {
            if (farthestRadiusSquared < (-320.0f + candidateEntity.positionX) * (candidateEntity.positionX - 320.0f) + (-240.0f + candidateEntity.positionY) * (-240.0f + candidateEntity.positionY)) {
              farthestRadiusSquared = (-320.0f + candidateEntity.positionX) * (candidateEntity.positionX - 320.0f) + (candidateEntity.positionY - 240.0f) * (-240.0f + candidateEntity.positionY);
              farthestEntity = candidateEntity;
            }
            candidateEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.previousForIteration(0));
          }
          cascadeFrontier = new SecondaryDeque();
          visitedCascadeEntities = new SecondaryDeque();
          staggeredLifetime = 0;
          cascadeFrontier.addFirst(farthestEntity, false);
          while (true) {
            cascadeEntity = (GameplayEntity) ((Object) cascadeFrontier.removeFirst(true));
            if (cascadeEntity == null) {
              return true;
            }
            cascadeEntity.entitySpriteKindId = 6;
            cascadeEntity.remainingLifetimeTicks = staggeredLifetime;
            staggeredLifetime += 50;
            visitedCascadeEntities.addFirst(cascadeEntity, false);
            neighborIndex = 0;
            while (true) {
              if (neighborIndex >= cascadeEntity.relatedEntityCount) {
                break;
              }
              neighborEntity = cascadeEntity.relatedEntities[neighborIndex];
              searchedEntity = (GameplayEntity) ((Object) visitedCascadeEntities.firstForIteration((byte) 121));
              while (true) {
                unseenCascadeNeighborSelection: {
                  if (searchedEntity == null) {
                    searchedEntity = (GameplayEntity) ((Object) cascadeFrontier.firstForIteration((byte) 121));
                    while (searchedEntity != null) {
                      if (searchedEntity == neighborEntity) {
                        break unseenCascadeNeighborSelection;
                      }
                      searchedEntity = (GameplayEntity) ((Object) cascadeFrontier.nextForIteration(69));
                    }
                    cascadeFrontier.addLast(-82, neighborEntity);
                    break unseenCascadeNeighborSelection;
                  }
                  if (searchedEntity != neighborEntity) {
                    searchedEntity = (GameplayEntity) ((Object) visitedCascadeEntities.nextForIteration(param0 ^ 24));
                    continue;
                  }
                }
                break;
              }
              neighborIndex++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1_ref), "sk.D(" + param0 + ')');
        }
    }

    BufferedRandomAccessFile(LimitedRandomAccessFile file, int readBufferCapacity, int writeBufferCapacity) throws IOException {
        long initialFileLength = 0L;
        this.writeBufferLength = 0;
        this.writeBufferStart = -1L;
        this.readBufferStart = -1L;
        try {
            this.file = file;
            initialFileLength = file.length(1);
            this.physicalLength = initialFileLength;
            this.logicalLength = initialFileLength;
            this.writeBuffer = new byte[writeBufferCapacity];
            this.readBuffer = new byte[readBufferCapacity];
            this.position = 0L;
        } catch (RuntimeException constructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailure), "sk.<init>(" + (file != null ? "{...}" : "null") + ',' + readBufferCapacity + ',' + writeBufferCapacity + ')');
        }
    }

    static {
    }
}
