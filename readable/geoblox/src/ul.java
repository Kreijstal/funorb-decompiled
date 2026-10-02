/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul {
    static Calendar field_c;
    static int releasedInCurrentTheme;
    static Sprite field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 > -58) {
            j var2 = (j) null;
            ul.a((j) null, (j) null, (byte) -96);
        }
    }

    final static void collectMatchCandidates(int methodGuard) {
        int firstNeighborIndex = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int[] stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_68_5;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int eligibleNeighborhoodVisited = 0;
        RuntimeException var1 = null;
        int dualMatchFound = 0;
        GameplayEntity centralEntity = null;
        int variantMatchingAllowed = 0;
        int categoryMatchingAllowed = 0;
        int firstNeighborSharesVariant = 0;
        int firstNeighborSharesCategory = 0;
        int secondNeighborIndex = 0;
        int tripleSharesCategory = 0;
        int tripleSharesVariant = 0;
        int largestPackedEntityId = 0;
        int middlePackedEntityId = 0;
        int smallestPackedEntityId = 0;
        int swappedEntityId = 0;
        int controlFlowGuard = 0;
        controlFlowGuard = Geoblox.field_C;
        try {
          h.matchCandidateCount = 0;
          eligibleNeighborhoodVisited = 0;
          dualMatchFound = 0;
          centralEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
          if (methodGuard != -2) {
            field_a = (Sprite) null;
          }
          L1: while (centralEntity != null) {
            L3: {
              if (centralEntity.sameVariantEntityCount <= 1) {
                if (centralEntity.sameCategoryEntityCount <= 1) {
                  break L3;
                }
              }
              centralEntity.entityQueue = bh.field_c;
              if (centralEntity.sameVariantEntityCount <= 1) {
                stackIn_10_0 = 0;
              } else {
                stackIn_10_0 = 1;
              }
              variantMatchingAllowed = stackIn_10_0;
              if (centralEntity.sameCategoryEntityCount <= 1) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = 1;
              }
              categoryMatchingAllowed = stackIn_13_0;
              for (firstNeighborIndex = 0; firstNeighborIndex < centralEntity.relatedEntityCount; firstNeighborIndex++) {
                eligibleNeighborhoodVisited = 1;
                if (variantMatchingAllowed != 0) {
                  if (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[firstNeighborIndex].spriteVariantIndex) {
                    stackIn_21_0 = 1;
                  } else {
                    stackIn_21_0 = 0;
                  }
                } else {
                  stackIn_21_0 = 0;
                }
                firstNeighborSharesVariant = stackIn_21_0;
                if (categoryMatchingAllowed != 0) {
                  if (centralEntity.entityCategoryKey == centralEntity.relatedEntities[firstNeighborIndex].entityCategoryKey) {
                    stackIn_27_0 = 1;
                  } else {
                    stackIn_27_0 = 0;
                  }
                } else {
                  stackIn_27_0 = 0;
                }
                L10: {
                  firstNeighborSharesCategory = stackIn_27_0;
                  if (firstNeighborSharesVariant == 0) {
                    if (firstNeighborSharesCategory == 0) {
                      break L10;
                    }
                  }
                  secondNeighborIndex = firstNeighborIndex + 1;
                  L12: while (true) {
                    if (secondNeighborIndex >= centralEntity.relatedEntityCount) {
                      break L10;
                    } else {
                      if (firstNeighborSharesCategory != 0) {
                        if (centralEntity.relatedEntities[secondNeighborIndex].entityCategoryKey == centralEntity.entityCategoryKey) {
                          stackIn_38_0 = 1;
                        } else {
                          stackIn_38_0 = 0;
                        }
                      } else {
                        stackIn_38_0 = 0;
                      }
                      tripleSharesCategory = stackIn_38_0;
                      if (firstNeighborSharesVariant != 0) {
                        if (centralEntity.spriteVariantIndex == centralEntity.relatedEntities[secondNeighborIndex].spriteVariantIndex) {
                          stackIn_44_0 = 1;
                        } else {
                          stackIn_44_0 = 0;
                        }
                      } else {
                        stackIn_44_0 = 0;
                      }
                      L15: {
                        tripleSharesVariant = stackIn_44_0;
                        if (tripleSharesCategory == 0) {
                          if (tripleSharesVariant == 0) {
                            break L15;
                          }
                        }
                        centralEntity.relatedEntities[firstNeighborIndex].entityQueue = bh.field_c;
                        centralEntity.relatedEntities[secondNeighborIndex].entityQueue = bh.field_c;
                        middlePackedEntityId = centralEntity.relatedEntities[firstNeighborIndex].entityId;
                        largestPackedEntityId = centralEntity.entityId;
                        smallestPackedEntityId = centralEntity.relatedEntities[secondNeighborIndex].entityId;
                        if (middlePackedEntityId < smallestPackedEntityId) {
                          swappedEntityId = middlePackedEntityId;
                          middlePackedEntityId = smallestPackedEntityId;
                          smallestPackedEntityId = swappedEntityId;
                        }
                        if (tripleSharesVariant != 0) {
                          dd.variantMatchCandidateCount = dd.variantMatchCandidateCount + 1;
                        }
                        if (tripleSharesVariant != 0) {
                          if (tripleSharesCategory != 0) {
                          }
                        }
                        if (tripleSharesCategory != 0) {
                          dk.categoryMatchCandidateCount = dk.categoryMatchCandidateCount + 1;
                        }
                        if (largestPackedEntityId >= smallestPackedEntityId) {
                          if (middlePackedEntityId > largestPackedEntityId) {
                            swappedEntityId = largestPackedEntityId;
                            largestPackedEntityId = middlePackedEntityId;
                            middlePackedEntityId = swappedEntityId;
                          }
                        } else {
                          swappedEntityId = middlePackedEntityId;
                          middlePackedEntityId = smallestPackedEntityId;
                          smallestPackedEntityId = largestPackedEntityId;
                          largestPackedEntityId = swappedEntityId;
                        }
                        stackIn_64_0 = nk.packedMatchCandidates;

                        stackIn_64_1 = h.matchCandidateCount;

                        stackIn_64_2 = nk.packedMatchCandidates[h.matchCandidateCount];

                        stackIn_64_3 = smallestPackedEntityId;

                        if (tripleSharesCategory == 0) {
                          stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                          stackIn_65_1 = stackIn_64_1;
                          stackIn_65_2 = stackIn_64_2;
                          stackIn_65_3 = stackIn_64_3;
                          stackIn_65_4 = 0;
                        } else {
                          stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                          stackIn_65_1 = stackIn_64_1;
                          stackIn_65_2 = stackIn_64_2;
                          stackIn_65_3 = stackIn_64_3;
                          stackIn_65_4 = -2147483648;
                        }










                        if (tripleSharesVariant == 0) {
                          stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                          stackIn_68_5 = 0;
                        } else {
                          stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                          stackIn_68_5 = 1073741824;
                        }
                        stackIn_65_0[stackIn_65_1] = lb.a(stackIn_65_2, lb.a(stackIn_65_3, lb.a(lb.a(lb.a(stackIn_65_4, stackIn_68_5), largestPackedEntityId << 20), middlePackedEntityId << 10)));
                        h.matchCandidateCount = h.matchCandidateCount + 1;
                      }
                      if (tripleSharesCategory != 0) {
                        if (tripleSharesVariant != 0) {
                          dualMatchFound = 1;
                        }
                        secondNeighborIndex++;
                        continue L12;
                      } else {
                        secondNeighborIndex++;
                        continue L12;
                      }
                    }
                  }
                }
              }
              break L3;
            }
            centralEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
          }
          if (eligibleNeighborhoodVisited != 0) {
            if (dualMatchFound == 0) {
              stackIn_82_0 = 4;
              stackIn_82_1 = 0;
              jc.requestAvatarFeedback(stackIn_82_0, stackIn_82_1 != 0);
            } else {
              jc.requestAvatarFeedback(5, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ul.C(" + methodGuard + ')');
        }
    }

    final static boolean a(j param0, j param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          if (param2 == 127) {
            var3_int = param0.field_kb - param1.field_kb;
            if (eg.field_l != param0.field_mb) {
              if (param0.field_mb == null) {
                var3_int += 200;
              }
            } else {
              var3_int -= 200;
            }
            if (param1.field_mb == eg.field_l) {
              var3_int += 200;
            } else {
              if (null == param1.field_mb) {
                var3_int -= 200;
              }
            }
            if (0 >= var3_int) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = 1;
            }
            return stackIn_15_0 != 0;
          } else {
            stackIn_3_0 = 0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var3);

          stackIn_18_1 = new StringBuilder().append("ul.D(");

          if (param0 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }


          stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

          if (param1 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, rh param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new Sprite(param1.a(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) f.field_kb));
            var3 = var2.width;
            var4 = var2.height;
            oc.b(param0 + 21619);
            bk.field_b = new Sprite(var3, 3 * var4 / 4);
            bk.field_b.e();
            var2.c(0, 0);
            cl.field_b = new Sprite(var3, var4 - bk.field_b.height);
            cl.field_b.e();
            if (param0 != -21541) {
                field_a = (Sprite) null;
            }
            var2.c(0, -bk.field_b.height);
            cl.field_b.trimY = bk.field_b.height;
            id.a(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ul.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
