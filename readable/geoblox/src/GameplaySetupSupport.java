/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplaySetupSupport {
    static PointerInputListener pointerListener;
    static int[] firstVertexTransformedY;
    static String[] achievementTitles;
    static boolean screenChangePending;
    static int decodedSpriteCanvasWidth;

    final static void resetGameplayDifficulty(int methodGuard) {
        TextTemplateDefinition.entityMotionSpeed = 0.4000000059604645f;
        ContextualRuntimeException.specialSpriteKindProbability = 0.0;
        MatchCandidateSupport.releasedInCurrentTheme = 0;
        EmailValidator.availableSpriteVariantCount = 3;
        CacheReference.field_m = 0;
        ArchiveNetworkClient.difficultyStep = 0;
        MessageDialogSupport.releasesPerTheme = 40;
        MessageDialog.availableEntityCategoryCount = 4;
        FullscreenEntrySupport.adjustThemeReleaseQuota(10);
        FullscreenErrorDialog.spawnIntervalScale = 0.75f;
        DualLinkNode.rotationStepRadians = 0.01666666753590107f;
        if (methodGuard != 9408) {
            return;
        }
        TextTemplateDefinitionLoader.releasedInDifficultyStep = 0;
        ContextualRuntimeException.recomputeSpawnReleaseInterval(true);
        UiWidget.completedThemeCount = 0;
        DequeCursor.field_c = 0;
    }

    final static void readReflectionCheckRequest(int methodGuard, PlatformTaskDispatcher taskDispatcher, int unusedArgument, ByteArrayBuffer buffer) {
        try {
            int argumentTypeNameIndex = 0;
            int serializedArgumentIndex = 0;
            byte[] newSerializedArgumentBytes = null;
            RuntimeException requestFailureCause = null;
            StringBuilder requestFailurePrefix = null;
            String dispatcherDescription = null;
            StringBuilder messageBeforeBufferDescription = null;
            String bufferDescription = null;
            int operationIncrementAlreadyApplied = 0;
            Throwable caughtReflectionFailure = null;
            RuntimeException requestFailureForContext = null;
            int operationIndex = 0;
            int operationType = 0;
            ClassNotFoundException classResolutionFailureAlias = null;
            SecurityException securityFailureAlias = null;
            NullPointerException nullFailureAlias = null;
            Exception operationExceptionAlias = null;
            Throwable operationThrowableAlias = null;
            String unusedFieldOwnerNameAlias = null;
            String memberName = null;
            int argumentCountOrIntegerWriteValue = 0;
            String[] argumentTypeNames = null;
            byte[][] serializedArgumentsAlias = null;
            Class[] resolvedArgumentClasses = null;
            int serializedArgumentLengthThenClassIndexSnapshot = 0;
            int unusedClientControlSnapshot = 0;
            ByteArrayBuffer unusedNullBufferSnapshot = null;
            String fieldOwnerClassName = null;
            String fieldName = null;
            int argumentClassIndex = 0;
            ReflectionCheckRequest reflectionRequest = null;
            byte[][] serializedArgumentsBeforeAlias = null;
            String methodOwnerClassName = null;
            byte[][] allocatedSerializedArguments = null;
            unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              reflectionRequest = new ReflectionCheckRequest();
              reflectionRequest.operationCount = buffer.readUnsignedByte((byte) 34);
              reflectionRequest.requestId = buffer.readIntBE((byte) -127);
              reflectionRequest.operationErrors = new int[reflectionRequest.operationCount];
              reflectionRequest.methodLookupTasks = new PlatformTask[reflectionRequest.operationCount];
              reflectionRequest.integerWriteValues = new int[reflectionRequest.operationCount];
              reflectionRequest.fieldLookupTasks = new PlatformTask[reflectionRequest.operationCount];
              reflectionRequest.operationTypes = new int[reflectionRequest.operationCount];
              reflectionRequest.serializedArguments = new byte[reflectionRequest.operationCount][][];
              operationIndex = 0;
              while (operationIndex < reflectionRequest.operationCount) {
                try {
                  L2: {
                    operationType = buffer.readUnsignedByte((byte) 34);
                    if ((0 != operationType) &&
                        (1 != operationType) &&
                        (operationType != 2)) {
                      if ((operationType != 3) &&
                          (operationType != 4)) {
                        operationIndex++;
                        operationIncrementAlreadyApplied = 1;
                        break L2;
                      }
                      methodOwnerClassName = buffer.readNullTerminatedText((byte) 103);
                      memberName = buffer.readNullTerminatedText((byte) 98);
                      argumentCountOrIntegerWriteValue = buffer.readUnsignedByte((byte) 34);
                      argumentTypeNames = new String[argumentCountOrIntegerWriteValue];
                      for (argumentTypeNameIndex = 0; argumentCountOrIntegerWriteValue > argumentTypeNameIndex; argumentTypeNameIndex++) {
                        argumentTypeNames[argumentTypeNameIndex] = buffer.readNullTerminatedText((byte) 120);
                      }
                      allocatedSerializedArguments = new byte[argumentCountOrIntegerWriteValue][];
                      serializedArgumentsBeforeAlias = allocatedSerializedArguments;
                      serializedArgumentsAlias = serializedArgumentsBeforeAlias;
                      if (operationType == 3) {
                        for (serializedArgumentIndex = 0; serializedArgumentIndex < argumentCountOrIntegerWriteValue; serializedArgumentIndex++) {
                          serializedArgumentLengthThenClassIndexSnapshot = buffer.readIntBE((byte) -70);
                          newSerializedArgumentBytes = new byte[serializedArgumentLengthThenClassIndexSnapshot];
                          serializedArgumentsAlias[serializedArgumentIndex] = newSerializedArgumentBytes;
                          buffer.readBytes(29915, serializedArgumentLengthThenClassIndexSnapshot, allocatedSerializedArguments[serializedArgumentIndex], 0);
                        }
                      }
                      reflectionRequest.operationTypes[operationIndex] = operationType;
                      resolvedArgumentClasses = new Class[argumentCountOrIntegerWriteValue];
                      argumentClassIndex = 0;
                      serializedArgumentLengthThenClassIndexSnapshot = argumentClassIndex;
                      while (argumentClassIndex < argumentCountOrIntegerWriteValue) {
                        resolvedArgumentClasses[argumentClassIndex] = EmailValidator.a(argumentTypeNames[argumentClassIndex], false);
                        argumentClassIndex++;
                      }
                      reflectionRequest.methodLookupTasks[operationIndex] = taskDispatcher.requestDeclaredMethod(memberName, -126, resolvedArgumentClasses, EmailValidator.a(methodOwnerClassName, false));
                      reflectionRequest.serializedArguments[operationIndex] = allocatedSerializedArguments;
                    } else {
                      fieldOwnerClassName = buffer.readNullTerminatedText((byte) 117);
                      unusedFieldOwnerNameAlias = fieldOwnerClassName;
                      fieldName = buffer.readNullTerminatedText((byte) 125);
                      memberName = fieldName;
                      argumentCountOrIntegerWriteValue = 0;
                      if (operationType == 1) {
                        argumentCountOrIntegerWriteValue = buffer.readIntBE((byte) -123);
                      }
                      reflectionRequest.operationTypes[operationIndex] = operationType;
                      reflectionRequest.integerWriteValues[operationIndex] = argumentCountOrIntegerWriteValue;
                      reflectionRequest.fieldLookupTasks[operationIndex] = taskDispatcher.requestDeclaredField(EmailValidator.a(fieldOwnerClassName, false), 0, fieldName);
                    }
                    operationIncrementAlreadyApplied = 0;
                  }
                } catch (java.lang.ClassNotFoundException operationClassResolutionFailure) {
                  caughtReflectionFailure = operationClassResolutionFailure;
                  classResolutionFailureAlias = (ClassNotFoundException) (Object) caughtReflectionFailure;
                  reflectionRequest.operationErrors[operationIndex] = -1;
                  operationIncrementAlreadyApplied = 0;
                } catch (java.lang.SecurityException operationSecurityFailure) {
                  caughtReflectionFailure = operationSecurityFailure;
                  securityFailureAlias = (SecurityException) (Object) caughtReflectionFailure;
                  reflectionRequest.operationErrors[operationIndex] = -2;
                  operationIncrementAlreadyApplied = 0;
                } catch (java.lang.NullPointerException operationNullFailure) {
                  caughtReflectionFailure = operationNullFailure;
                  nullFailureAlias = (NullPointerException) (Object) caughtReflectionFailure;
                  reflectionRequest.operationErrors[operationIndex] = -3;
                  operationIncrementAlreadyApplied = 0;
                } catch (java.lang.Exception operationException) {
                  caughtReflectionFailure = operationException;
                  operationExceptionAlias = (Exception) (Object) caughtReflectionFailure;
                  reflectionRequest.operationErrors[operationIndex] = -4;
                  operationIncrementAlreadyApplied = 0;
                } catch (java.lang.Throwable operationThrowable) {
                  caughtReflectionFailure = operationThrowable;
                  operationThrowableAlias = caughtReflectionFailure;
                  reflectionRequest.operationErrors[operationIndex] = -5;
                  operationIncrementAlreadyApplied = 0;
                }
                if (!(operationIncrementAlreadyApplied == 0)) {
                  continue;
                }
                operationIndex++;
              }
              if (methodGuard != -4) {
                unusedNullBufferSnapshot = (ByteArrayBuffer) null;
                GameplaySetupSupport.readReflectionCheckRequest(96, (PlatformTaskDispatcher) null, -109, (ByteArrayBuffer) null);
              }
              UsernameAvailabilityQuery.field_k.addLast(-92, reflectionRequest);
              return;
            } catch (java.lang.RuntimeException requestFailure) {
              caughtReflectionFailure = requestFailure;
              requestFailureForContext = (RuntimeException) (Object) caughtReflectionFailure;
              requestFailureCause = requestFailureForContext;
              requestFailurePrefix = new StringBuilder().append("pg.C(").append(methodGuard).append(',');
              if (taskDispatcher == null) {
                dispatcherDescription = "null";
              } else {
                dispatcherDescription = "{...}";
              }
              messageBeforeBufferDescription = ((StringBuilder) (Object) requestFailurePrefix).append(dispatcherDescription).append(',').append(unusedArgument).append(',');
              if (buffer == null) {
                bufferDescription = "null";
              } else {
                bufferDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) requestFailureCause), ((StringBuilder) (Object) messageBeforeBufferDescription).append(bufferDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedRequestFailure) {
            throw uncheckedRequestFailure;
        } catch (Throwable checkedRequestFailure) {
            throw new RuntimeException(checkedRequestFailure);
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        firstVertexTransformedY = null;
        pointerListener = null;
        achievementTitles = null;
        if (methodGuard != 22059) {
            GameplaySetupSupport.resetGameplayDifficulty(52);
        }
    }

    static {
        firstVertexTransformedY = new int[8192];
        pointerListener = new PointerInputListener();
        achievementTitles = new String[]{"Geoblox Flush", "Ordered Geometry", "Perfect Geometry", "Chain Geometry", "Sequence Geometry", "Succession Geometry", "Dark Geometry", "Lightning Geometrician", "Natural Geometrician", "Sweet Geometrician", "Sparkly Geometrician", "Sick Geometrician", "Stellar Geometrician", "Sporty Geometrician", "Cooking Geometrician", "Parallel Geometrician", "Spooky Geometrician"};
    }
}
