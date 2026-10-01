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

    final static void collectMatchCandidates(int param0) {
        int var6 = 0;
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
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        GameplayEntity var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Geoblox.field_C;
        try {
          L0: {
            h.matchCandidateCount = 0;
            var1_int = 0;
            var2 = 0;
            var3 = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
            if (param0 != -2) {
              field_a = (Sprite) null;
            }
            L2: while (var3 != null) {
              L4: {
                if (-2 <= (var3.sameVariantEntityCount ^ -1)) {
                  if (var3.sameCategoryEntityCount <= 1) {
                    break L4;
                  }
                }
                var3.entityQueue = bh.field_c;
                if ((var3.sameVariantEntityCount ^ -1) >= -2) {
                  stackIn_10_0 = 0;
                } else {
                  stackIn_10_0 = 1;
                }
                var4 = stackIn_10_0;
                if (-2 <= (var3.sameCategoryEntityCount ^ -1)) {
                  stackIn_13_0 = 0;
                } else {
                  stackIn_13_0 = 1;
                }
                var5 = stackIn_13_0;
                for (var6 = 0; var6 < var3.relatedEntityCount; var6++) {
                  var1_int = 1;
                  if (var4 != 0) {
                    if (var3.spriteVariantIndex == var3.relatedEntities[var6].spriteVariantIndex) {
                      stackIn_21_0 = 1;
                    } else {
                      stackIn_21_0 = 0;
                    }
                  } else {
                    stackIn_21_0 = 0;
                  }
                  var7 = stackIn_21_0;
                  if (var5 != 0) {
                    if (var3.entityCategoryKey == var3.relatedEntities[var6].entityCategoryKey) {
                      stackIn_27_0 = 1;
                    } else {
                      stackIn_27_0 = 0;
                    }
                  } else {
                    stackIn_27_0 = 0;
                  }
                  L11: {
                    var8 = stackIn_27_0;
                    if (var7 == 0) {
                      if (var8 == 0) {
                        break L11;
                      }
                    }
                    var9 = var6 + 1;
                    L13: while (true) {
                      if (var9 >= var3.relatedEntityCount) {
                        break L11;
                      } else {
                        if (var8 != 0) {
                          if (var3.relatedEntities[var9].entityCategoryKey == var3.entityCategoryKey) {
                            stackIn_38_0 = 1;
                          } else {
                            stackIn_38_0 = 0;
                          }
                        } else {
                          stackIn_38_0 = 0;
                        }
                        var10 = stackIn_38_0;
                        if (var7 != 0) {
                          if (var3.spriteVariantIndex == var3.relatedEntities[var9].spriteVariantIndex) {
                            stackIn_44_0 = 1;
                          } else {
                            stackIn_44_0 = 0;
                          }
                        } else {
                          stackIn_44_0 = 0;
                        }
                        L16: {
                          var11 = stackIn_44_0;
                          if (var10 == 0) {
                            if (var11 == 0) {
                              break L16;
                            }
                          }
                          var3.relatedEntities[var6].entityQueue = bh.field_c;
                          var3.relatedEntities[var9].entityQueue = bh.field_c;
                          var13 = var3.relatedEntities[var6].entityId;
                          var12 = var3.entityId;
                          var14 = var3.relatedEntities[var9].entityId;
                          if (var13 < var14) {
                            var15 = var13;
                            var13 = var14;
                            var14 = var15;
                          }
                          if (var11 != 0) {
                            dd.variantMatchCandidateCount = dd.variantMatchCandidateCount + 1;
                          }
                          if (var11 != 0) {
                            if (var10 != 0) {
                            }
                          }
                          if (var10 != 0) {
                            dk.categoryMatchCandidateCount = dk.categoryMatchCandidateCount + 1;
                          }
                          if (var12 >= var14) {
                            if (var13 > var12) {
                              var15 = var12;
                              var12 = var13;
                              var13 = var15;
                            }
                          } else {
                            var15 = var13;
                            var13 = var14;
                            var14 = var12;
                            var12 = var15;
                          }
                          stackIn_64_0 = nk.packedMatchCandidates;

                          stackIn_64_1 = h.matchCandidateCount;

                          stackIn_64_2 = nk.packedMatchCandidates[h.matchCandidateCount];

                          stackIn_64_3 = var14;

                          if (var10 == 0) {
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










                          if (var11 == 0) {
                            stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                            stackIn_68_5 = 0;
                          } else {
                            stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                            stackIn_68_5 = 1073741824;
                          }
                          stackIn_65_0[stackIn_65_1] = lb.a(stackIn_65_2, lb.a(stackIn_65_3, lb.a(lb.a(lb.a(stackIn_65_4, stackIn_68_5), var12 << -1372000780), var13 << 147551786)));
                          h.matchCandidateCount = h.matchCandidateCount + 1;
                        }
                        if (var10 != 0) {
                          if (var11 != 0) {
                            var2 = 1;
                          }
                          var9++;
                          continue L13;
                        } else {
                          var9++;
                          continue L13;
                        }
                      }
                    }
                  }
                }
                break L4;
              }
              var3 = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
            }
            if (var1_int != 0) {
              if (var2 == 0) {
                stackIn_82_0 = 4;
                stackIn_82_1 = 0;
                jc.a(stackIn_82_0, stackIn_82_1 != 0);
              } else {
                jc.a(5, false);
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ul.C(" + param0 + ')');
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
        int decompiledRegionSelector0 = 0;
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
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_3_0 = 0;
            decompiledRegionSelector0 = 0;
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
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
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
            cl.field_b = new Sprite(var3, var4 + -bk.field_b.height);
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
