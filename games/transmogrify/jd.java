/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param2.length) {
              var17 = new int[256];
              var12 = var17;
              var11 = var12;
              var3 = var11;
              var5 = -98 / ((-28 - param1) / 54);
              var18 = new int[256];
              var13 = var18;
              var4 = var13;
              var19 = new int[256];
              var14 = var19;
              var6 = var14;
              var20 = new int[256];
              var15 = var20;
              var7 = var15;
              var21 = new byte[256][];
              var16 = var21;
              var8 = var16;
              var9 = 0;
              L1: while (true) {
                if (var9 >= 256) {
                  stackIn_7_0 = new mi(param0, var17, var18, var19, var20, var21);
                  break L0;
                } else {
                  var11[var9] = param2[var9].field_c;
                  var4[var9] = param2[var9].field_b;
                  var6[var9] = param2[var9].field_f;
                  var7[var9] = param2[var9].field_g;
                  var8[var9] = param2[var9].field_i;
                  var9++;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jd.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        try {
            je.a(-11);
            if (param10) {
                field_a = -111;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        oa stackIn_13_0 = null;
        oa stackIn_14_0 = null;
        String stackIn_14_1 = null;
        oa stackIn_16_0 = null;
        oa stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var14 = param6.a(false);
            var8 = param1.a(false);
            if (param2 == -9) {
              L1: {
                if (null != nk.field_b) {
                  break L1;
                } else {
                  if (gk.a(false, 127)) {
                    break L1;
                  } else {
                    stackIn_7_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (lj.field_z == jk.field_y) {
                  L3: {
                    ch.field_f = null;
                    ff.field_D.field_h = 0;
                    if (param3 != null) {
                      L4: {
                        var9 = 0;
                        if (param5) {
                          var9 = var9 | 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -94, d.field_c.nextInt());
                        d.field_d.a(param2 ^ 110, d.field_c.nextInt());
                        d.field_d.a(var14, 123);
                        d.field_d.a(var8, 125);
                        var15 = (CharSequence) ((Object) param3);
                        d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
                        d.field_d.c(param4, -159688920);
                        d.field_d.f(6389, param0);
                        d.field_d.f(6389, var9);
                        ff.field_D.f(6389, 18);
                        ff.field_D.field_h = ff.field_D.field_h + 2;
                        var10 = ff.field_D.field_h;
                        var11_ref_String = wk.a(ha.b(116), (byte) -45);
                        if (var11_ref_String == null) {
                          var11_ref_String = "";
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ff.field_D.a(92, var11_ref_String);
                      bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -123, d.field_d);
                      ff.field_D.b(-109, ff.field_D.field_h - var10);
                      break L3;
                    } else {
                      L6: {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -96, d.field_c.nextInt());
                        d.field_d.a(-103, d.field_c.nextInt());
                        stackIn_13_0 = d.field_d;

                        if (param6.a((byte) -121)) {
                          stackIn_14_0 = (oa) ((Object) stackIn_13_0);
                          stackIn_14_1 = (String) (var14);
                          break L6;
                        } else {
                          stackIn_14_0 = (oa) ((Object) stackIn_13_0);
                          stackIn_14_1 = "";
                          break L6;
                        }
                      }
                      L7: {
                        ((oa) (Object) stackIn_14_0).a(stackIn_14_1, 126);
                        stackIn_16_0 = d.field_d;

                        if (param1.a((byte) -121)) {
                          stackIn_17_0 = (oa) ((Object) stackIn_16_0);
                          stackIn_17_1 = (String) (var8);
                          break L7;
                        } else {
                          stackIn_17_0 = (oa) ((Object) stackIn_16_0);
                          stackIn_17_1 = "";
                          break L7;
                        }
                      }
                      ((oa) (Object) stackIn_17_0).a(stackIn_17_1, param2 ^ -117);
                      ff.field_D.f(6389, 16);
                      ff.field_D.field_h = ff.field_D.field_h + 1;
                      var9 = ff.field_D.field_h;
                      bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -108, d.field_d);
                      ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
                      break L3;
                    }
                  }
                  rb.a(-1, -377);
                  lj.field_z = vf.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L8: {
                if (vf.field_b != lj.field_z) {
                  break L8;
                } else {
                  if (!ue.a(1, 0)) {
                    break L8;
                  } else {
                    L9: {
                      var9 = nf.field_l.d((byte) 97);
                      nf.field_l.field_h = 0;
                      if (-101 < (var9 ^ -1)) {
                        break L9;
                      } else {
                        if (-106 > (var9 ^ -1)) {
                          break L9;
                        } else {
                          lj.field_z = aa.field_b;
                          wh.field_F = new String[var9 + -100];
                          break L8;
                        }
                      }
                    }
                    if (-249 != (var9 ^ -1)) {
                      if (99 != var9) {
                        lj.field_z = gg.field_f;
                        tg.field_a = -1;
                        ca.field_e = var9;
                        break L8;
                      } else {
                        ue.a(jk.a((byte) -114), 0);
                        ch.field_f = new Boolean(oh.a((byte) -87, nf.field_l));
                        nf.field_l.field_h = 0;
                        break L8;
                      }
                    } else {
                      tb.a(ha.b(param2 ^ -66), true);
                      Transmogrify.field_B = nj.field_j;
                      pc.a(1);
                      ej.field_k = false;
                      stackIn_33_0 = var9;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              L10: {
                if (aa.field_b != lj.field_z) {
                  break L10;
                } else {
                  var9 = 2;
                  if (ue.a(var9, 0)) {
                    var10 = nf.field_l.a((byte) -102);
                    nf.field_l.field_h = 0;
                    if (!ue.a(var10, 0)) {
                      break L10;
                    } else {
                      var11 = wh.field_F.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var11 <= var12) {
                          pc.a(1);
                          ej.field_k = false;
                          stackIn_45_0 = var11 + 100;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          wh.field_F[var12] = nf.field_l.e(26);
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (gg.field_f == lj.field_z) {
                  if (ce.a(0)) {
                    L13: {
                      if (-256 == (ca.field_e ^ -1)) {
                        var9_ref_String = nf.field_l.j(-1640531527);
                        if (var9_ref_String == null) {
                          break L13;
                        } else {
                          v.a(0, var9_ref_String, ha.b(114));
                          break L13;
                        }
                      } else {
                        Transmogrify.field_B = nf.field_l.g(param2 + 12257);
                        break L13;
                      }
                    }
                    pc.a(1);
                    ej.field_k = false;
                    stackIn_55_0 = ca.field_e;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null != nk.field_b) {
                  break L14;
                } else {
                  if (ej.field_k) {
                    L15: {
                      if ((mc.b(true) ^ -1L) >= -30001L) {
                        Transmogrify.field_B = bd.field_s;
                        break L15;
                      } else {
                        Transmogrify.field_B = ng.field_h;
                        break L15;
                      }
                    }
                    ej.field_k = false;
                    stackIn_63_0 = 249;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    var9 = lf.field_c;
                    lf.field_c = kf.field_p;
                    kf.field_p = var9;
                    ej.field_k = true;
                    break L14;
                  }
                }
              }
              stackIn_65_0 = -1;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackIn_3_0 = -40;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("jd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L16;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L17;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L18;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_69_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_55_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_63_0;
                  } else {
                    return stackIn_65_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
