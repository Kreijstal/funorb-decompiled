/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    String field_d;
    String field_a;
    boolean field_c;
    static int field_b;

    final static void updateSpawnQueue(int param0) {
        RuntimeException decompiledCaughtException = null;
        GameplayEntity var1 = null;
        RuntimeException var1_ref = null;
        double var2 = 0.0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        double var8 = 0.0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            var1 = (GameplayEntity) ((Object) wd.spawnQueue.firstForIteration(0));
            L1: while (true) {
              L2: {
                if (var1 != null) {
                  var1.advanceEntityAnimation(true);
                  var1 = (GameplayEntity) ((Object) wd.spawnQueue.nextForIteration(1));
                  if (var10 != 0) {
                    break L2;
                  } else {
                    if (var10 == 0) {
                      continue L1;
                    }
                  }
                }
                if (param0 != 255) {
                  field_b = -11;
                }
              }
              L4: {
                L5: {
                  if (kj.field_o[99]) {
                    if (ji.movingEntities.isEmpty(13519)) {
                      break L5;
                    }
                  }
                  if ((kb.field_c ^ -1) <= (kc.field_a ^ -1)) {
                    if (-1 != (ul.releasedInCurrentTheme ^ -1)) {
                      break L4;
                    } else {
                      if (el.gameplaySession.tutorialMode) {
                        break L4;
                      }
                    }
                  }
                }
                if (0 < wd.spawnQueue.countNodes(param0 ^ -170)) {
                  if (!el.gameplaySession.spawnReleaseDisabled) {
                    ji.movingEntities.addLast(-48, wd.spawnQueue.removeFirst((byte) -124));
                    hd.recordEntityRelease(2);
                    kc.field_a = 0;
                  }
                }
              }
              kc.field_a = kc.field_a + 1;
              if (wd.spawnQueue.countNodes(param0 ^ 143) < 3) {
                if (ma.c((byte) -53)) {
                  if (!el.gameplaySession.canAdvanceSession(true)) {
                    var1 = (GameplayEntity) ((Object) ra.availableEntities.removeFirst((byte) -101));
                    if (null != var1) {
                      var2 = 2.0 * Math.random() * 3.141592653589793;
                      var4 = 240.0f * (float)Math.cos(var2) + 320.0f;
                      var5 = 240.0f + (float)Math.sin(var2) * 240.0f;
                      var6 = 320.0f - var4;
                      var7 = -var5 + 240.0f;
                      var8 = 1.0 / Math.sqrt((double)(var7 * var7 + var6 * var6));
                      var7 = (float)((double)var7 * var8);
                      var6 = (float)((double)var6 * var8);
                      var1.initializeEntityMotion(101, var4, vd.a(param0 ^ 741924143), og.entityMotionSpeed * var6, nf.c((byte) -67), kc.field_a + kb.field_c * (1 + wd.spawnQueue.countNodes(111)), 0.0f, var5, var7 * og.entityMotionSpeed, ij.m(param0 ^ 131), 0.0f);
                      wd.spawnQueue.addLast(-47, var1);
                      mf.b(false);
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.E(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -2) {
            lc.a((byte) -59);
          }
          oi.field_e = param0;
          pb.field_s = param2;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var3);

          stackIn_8_1 = new StringBuilder().append("lc.A(");

          if (param0 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int[] param11, int param12) {
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        var37 = Geoblox.field_C;
        try {
          L0: {
            if (param10 > -74) {
              field_b = 78;
            }
            var13_int = param0;
            var14 = 1122867;
            var15 = (var14 & 16711680) >>> -1079885168;
            var16 = var14 & 65280;
            var17 = var14 & 255;
            var18 = -param1;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var18 ^ -1) > -1) {
                    var19 = param5 * (param6 >> -1886768304);
                    if (var37 != 0) {
                      break L3;
                    } else {
                      var20 = -param9;
                      L5: while (true) {
                        L6: {
                          if ((var20 ^ -1) > -1) {
                            param12 = param11[var19 + (param0 >> -81490640)];
                            param0 = param0 + param3;
                            stackIn_23_0 = param12;

                            if (var37 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (stackIn_23_0 == 0) {
                                  param8++;
                                  if (var37 == 0) {
                                    break L8;
                                  }
                                }
                                var21 = param2[param8];
                                if ((var21 ^ -1) == -1) {
                                  param8++;
                                  if (var37 == 0) {
                                    break L8;
                                  }
                                }
                                var22 = 510 & var21 >> 1228331247;
                                var23 = (var21 & 65429) >> -300055672;
                                var24 = 255 & var21;
                                var25 = (var24 + var22) / 3 - -var23 >> -1090345247;
                                var26 = -(((255 & param12) + (param12 >> 1020607240 & 255) + (param12 >> -1338833040 & 255)) / 3) + 256;
                                var27 = var15 * (var25 << -1187127344 >>> 543802160) >>> 1389020232;
                                var28 = (var25 << 1167088136) * var16 >>> 2081269144;
                                var29 = var17 * var25 >>> 2020048840;
                                var25 = (var28 << -1742741880) + (var27 << -1929572144) - -var29;
                                var30 = var26 * ((16711680 & var25) >> -2028626672);
                                var31 = (255 & var25 >> 123665768) * var26;
                                var32 = (var25 & 255) * var26;
                                var33 = ((16711680 & var21) >>> -1099466064) * ((param12 & 16711680) >>> 878755504) >>> 766300104;
                                var34 = (var21 & 65280) * (param12 & 65280) >>> -1130661960;
                                var35 = (255 & var21) * (255 & param12) >>> 1483648232;
                                var36 = 256 + -var26;
                                var33 = var33 * var36;
                                var34 = var34 * var36;
                                var35 = var35 * var36;
                                incrementValue$0 = param8;
                                param8++;
                                param2[incrementValue$0] = (var32 + var35 >> 464198152) + ((var34 + var31 >> 115744520 << 1806472904) + (var30 + var33 >> 1812821320 << 249524688));
                              }
                              var20++;
                              if (var37 == 0) {
                                continue L5;
                              }
                            }
                          }
                          param6 = param6 + param4;
                          param8 = param8 + param7;
                          stackIn_23_0 = var13_int;
                        }
                        param0 = stackIn_23_0;
                        var18++;
                        if (var37 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_28_0 = (RuntimeException) (var13);

          stackIn_28_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
            stackIn_29_2 = "null";
          } else {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
            stackIn_29_2 = "{...}";
          }


          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

          if (param11 == null) {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
            stackIn_33_2 = "null";
          } else {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), stackIn_33_2 + ',' + param12 + ')');
        }
    }

    final static bg a(int param0, byte[] param1) {
        bg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        bg stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1) {
            stackIn_4_0 = null;
            decompiledRegionSelector0 = 0;
          } else {
            if (param0 != 4520) {
              lc.a(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
            }
            var2 = new bg(param1, GameplaySession.field_m, md.field_e, DualLinkNode.field_j, hl.field_K, mj.field_a);
            kj.c(true);
            stackIn_9_0 = (bg) (var2);
            decompiledRegionSelector0 = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var2_ref);

          stackIn_13_1 = new StringBuilder().append("lc.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bg) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        j stackIn_61_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        j var5 = null;
        String var5_ref = null;
        String var6 = null;
        j var6_ref = null;
        String var7 = null;
        j var7_ref = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (param0 != 104) {
              field_b = 67;
            }
            var1 = eh.field_d;
            var2 = var1.c((byte) 34);
            if (-1 == (var2 ^ -1)) {
              if (ug.field_a == null) {
                ug.field_a = new vg(128);
                ca.field_i = 0;
              }
              if (-2 != (var1.c((byte) 34) ^ -1)) {
                stackIn_15_0 = 0;
              } else {
                stackIn_15_0 = 1;
              }
              var3_int = stackIn_15_0;
              var4_ref_String = var1.e((byte) 105);
              if (var3_int != 0) {
                var1.e((byte) 108);
              }
              var5 = ud.a(0, var4_ref_String);
              var6 = var1.e((byte) 103);
              var7 = oe.a((CharSequence) ((Object) var4_ref_String), 12);
              if (null == var7) {
                var7 = var4_ref_String;
              }
              if (var5 == null) {
                var5 = ud.a(param0 ^ 104, var6);
                if (var5 != null) {
                  ug.field_a.a((long)var7.hashCode(), 113, var5);
                }
              }
              if (null == var5) {
                var5 = new j();
                ug.field_a.a((long)var7.hashCode(), 94, var5);
                fieldTemp$0 = ca.field_i;
                ca.field_i = ca.field_i + 1;
                var5.field_kb = fieldTemp$0;
                di.field_e.addLast(param0 ^ -86, var5);
              }
              var5.field_hb = var4_ref_String;
              decompiledRegionSelector0 = 0;
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (-4 == (var2 ^ -1)) {
                    if (-3 == (vk.field_a ^ -1)) {
                      vk.field_a = 1;
                    }
                    decompiledRegionSelector0 = 3;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      vk.field_a = 1;
                      var3 = var1.e((byte) 122);
                      eg.field_l = ((String) (var3)).intern();
                      var4 = var1.c((byte) 34);
                      pi.c(var4, param0 ^ -12742);
                      decompiledRegionSelector0 = 4;
                    } else {
                      gi.a((Throwable) null, "F1: " + og.e(55), (byte) 125);
                      jl.a((byte) -119);
                      decompiledRegionSelector0 = 5;
                    }
                  }
                } else {
                  if (vk.field_a == 1) {
                    vk.field_a = 2;
                  }
                  decompiledRegionSelector0 = 2;
                }
              } else {
                if (nh.field_a == null) {
                  nh.field_a = new vg(128);
                  mg.field_g = 0;
                }
                var3 = var1.e((byte) 108);
                if (((String) (var3)).equals("")) {
                  var3 = null;
                }
                var4_ref_String = var1.e((byte) 102);
                var5_ref = var1.e((byte) 110);
                var6_ref = jg.a((byte) -62, var4_ref_String);
                if (null == var6_ref) {
                  var6_ref = jg.a((byte) -62, var5_ref);
                  if (null != var6_ref) {
                    nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), 12).hashCode(), -63, var6_ref);
                  }
                }
                if (null == var6_ref) {
                  var6_ref = new j();
                  nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), param0 ^ 100).hashCode(), 110, var6_ref);
                  fieldTemp$1 = mg.field_g;
                  mg.field_g = mg.field_g + 1;
                  var6_ref.field_kb = fieldTemp$1;
                  hl.field_B.addLast(-59, var6_ref);
                }
                if (var3 != null) {
                  var3 = ((String) (var3)).intern();
                }
                var6_ref.field_hb = var4_ref_String;
                var6_ref.field_mb = (String) (var3);
                var6_ref.unlinkNode(false);
                var7_ref = (j) ((Object) hl.field_B.firstForIteration(0));
                L15: while (true) {
                  L16: {
                    if (null != var7_ref) {
                      stackIn_61_0 = (j) (var6_ref);

                      if (var8 != 0) {
                        break L16;
                      } else {
                        if (ul.a(stackIn_61_0, var7_ref, (byte) 127)) {
                          var7_ref = (j) ((Object) hl.field_B.nextForIteration(1));
                          if (var8 == 0) {
                            continue L15;
                          }
                        }
                      }
                    }
                    stackIn_61_0 = (j) (var7_ref);
                  }
                  L18: {
                    if (stackIn_61_0 == null) {
                      hl.field_B.addLast(-39, var6_ref);
                      if (var8 == 0) {
                        break L18;
                      }
                    }
                    le.a(var7_ref, 121, var6_ref);
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
    }
}
