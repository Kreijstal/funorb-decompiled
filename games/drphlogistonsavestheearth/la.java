/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static he field_a;
    static int field_b;

    final static nh[] a(String param0, vj param1, String param2, int param3) {
        nh[] var4 = null;
        RuntimeException var4_ref = null;
        nh[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = cl.a(param0, param1, -124, param2);
              var4[3].field_C = var4[3].field_w;
              var4[1].field_z = var4[1].field_y;
              var4[7].field_z = var4[7].field_y;
              if (param3 < -14) {
                break L1;
              } else {
                field_b = -117;
                break L1;
              }
            }
            var4[5].field_C = var4[5].field_w;
            stackIn_4_0 = (nh[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("la.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            if (param0 != 0) {
                la.a((rf) null, -9, true, -84, (byte) -88, -64, -25, (nh[]) null, 62, (nh[]) null, -111, 124, -88, -112, (rf) null, -41);
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "la.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, gk param2, int param3, gk param4, int param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              ig.field_h = param0;
              if (param1 == 2) {
                break L1;
              } else {
                field_a = (he) null;
                break L1;
              }
            }
            dg.field_d = param5;
            ue.field_a = param2;
            wd.field_c = param4;
            wa.field_N = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param5 + ')');
        }
    }

    final static void a(rf param0, int param1, boolean param2, int param3, byte param4, int param5, int param6, nh[] param7, int param8, nh[] param9, int param10, int param11, int param12, int param13, rf param14, int param15) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        try {
          L0: {
            L1: {
              hm.a(param3, param10, cb.field_a, a.field_i, param11, param14, pj.field_E, 480, param5, new gk(param9), di.field_d, new gk(param7), param0, df.field_h, false, param15, param12, param13, param6, b.field_h, param1);
              jk.a((byte) 49, param2, param8);
              if (param4 < -36) {
                break L1;
              } else {
                la.a(-76);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var16 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var16);

            stackIn_6_1 = new StringBuilder().append("la.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param15 + ')');
        }
    }

    final synchronized static long a(boolean param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long stackIn_8_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = 108;
                break L1;
              }
            }
            L2: {
              var1_long = System.currentTimeMillis();
              if ((var1_long ^ -1L) > (ce.field_f ^ -1L)) {
                s.field_b = s.field_b + (ce.field_f + -var1_long);
                break L2;
              } else {
                break L2;
              }
            }
            ce.field_f = var1_long;
            stackIn_8_0 = s.field_b + var1_long;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "la.C(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        hg stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        hg stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        hg var5 = null;
        String var5_ref = null;
        String var6 = null;
        hg var6_ref = null;
        String var7 = null;
        hg var7_ref = null;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var1 = dh.field_N;
            var2 = var1.l(31760);
            if (-1 == (var2 ^ -1)) {
              L1: {
                if (vg.field_j == null) {
                  vg.field_j = new hm(128);
                  fg.field_j = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-2 != (var1.l(31760) ^ -1)) {
                  stackIn_12_0 = 0;
                  break L2;
                } else {
                  stackIn_12_0 = 1;
                  break L2;
                }
              }
              L3: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1.b((byte) -100);
                if (var3_int != 0) {
                  var1.b((byte) -128);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var5 = ad.a(var4_ref_String, -122);
                var6 = var1.b((byte) -79);
                var7 = rh.a(-77, (CharSequence) ((Object) var4_ref_String));
                if (null != var7) {
                  break L4;
                } else {
                  var7 = var4_ref_String;
                  break L4;
                }
              }
              L5: {
                if (null == var5) {
                  var5 = ad.a(var6, param0 + -115);
                  if (var5 == null) {
                    break L5;
                  } else {
                    vg.field_j.a((long)var7.hashCode(), param0 ^ -13, var5);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5 != null) {
                  break L6;
                } else {
                  var5 = new hg();
                  vg.field_j.a((long)var7.hashCode(), -25, var5);
                  fieldTemp$0 = fg.field_j;
                  fg.field_j = fg.field_j + 1;
                  var5.field_tb = fieldTemp$0;
                  fb.field_g.a(var5, 255);
                  break L6;
                }
              }
              var5.field_V = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != param0) {
                if (var2 == 2) {
                  L7: {
                    if (1 != of.field_v) {
                      break L7;
                    } else {
                      of.field_v = 2;
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2 ^ -1) == -4) {
                    L8: {
                      if ((of.field_v ^ -1) != -3) {
                        break L8;
                      } else {
                        of.field_v = 1;
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var2 == 4) {
                      of.field_v = 1;
                      var3 = var1.b((byte) -101);
                      rc.field_e = ((String) (var3)).intern();
                      var4 = var1.l(31760);
                      dh.a(var4, 57);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      gb.a((Throwable) null, "F1: " + al.a(-56), 10);
                      eg.a((byte) 126);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                L9: {
                  if (gf.field_r == null) {
                    gf.field_r = new hm(128);
                    al.field_f = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var3 = var1.b((byte) -34);
                  if (!((String) (var3)).equals("")) {
                    break L10;
                  } else {
                    var3 = null;
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1.b((byte) -29);
                  var5_ref = var1.b((byte) -118);
                  var6_ref = pa.a(var4_ref_String, (byte) 67);
                  if (var6_ref == null) {
                    var6_ref = pa.a(var5_ref, (byte) 67);
                    if (var6_ref != null) {
                      gf.field_r.a((long)rh.a(param0 + 116, (CharSequence) ((Object) var4_ref_String)).hashCode(), 126, var6_ref);
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null != var6_ref) {
                    break L12;
                  } else {
                    var6_ref = new hg();
                    gf.field_r.a((long)rh.a(-30, (CharSequence) ((Object) var4_ref_String)).hashCode(), 124, var6_ref);
                    fieldTemp$1 = al.field_f;
                    al.field_f = al.field_f + 1;
                    var6_ref.field_tb = fieldTemp$1;
                    sh.field_a.a(var6_ref, 255);
                    break L12;
                  }
                }
                L13: {
                  if (null == var3) {
                    break L13;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L13;
                  }
                }
                var6_ref.field_V = var4_ref_String;
                var6_ref.field_qb = (String) (var3);
                var6_ref.a(param0 + -16176);
                var7_ref = (hg) ((Object) sh.field_a.h(param0 ^ -11152));
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          if (var7_ref == null) {
                            break L18;
                          } else {
                            stackIn_58_0 = (hg) (var7_ref);

                            stackIn_58_1 = -95;

                            stackIn_58_2 = (hg) (var6_ref);

                            if (var8 != 0) {
                              break L17;
                            } else {
                              if (!na.a(stackIn_58_0, (byte) stackIn_58_1, stackIn_58_2)) {
                                break L18;
                              } else {
                                var7_ref = (hg) ((Object) sh.field_a.e(0));
                                if (var8 == 0) {
                                  continue L14;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        if (var7_ref == null) {
                          break L16;
                        } else {
                          stackIn_58_0 = (hg) (var6_ref);
                          stackIn_58_1 = 16709;
                          stackIn_58_2 = (hg) (var7_ref);
                          break L17;
                        }
                      }
                      tf.a(stackIn_58_0, stackIn_58_1, stackIn_58_2);
                      if (var8 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    sh.field_a.a(var6_ref, 255);
                    break L15;
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
          throw ie.a((Throwable) ((Object) var1_ref), "la.E(" + param0 + ')');
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
