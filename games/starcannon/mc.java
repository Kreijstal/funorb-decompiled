/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static byte[] field_g;
    static int field_h;
    static String field_d;
    static int field_c;
    static String field_a;
    static String field_i;
    static int field_f;
    static int[] field_j;
    static String field_e;

    public static void a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 40) {
            String var2 = (String) null;
            discarded$0 = mc.a((String) null, 80);
        }
        field_a = null;
        field_d = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackOut_2_0 = ba.field_e.equals(ni.a(125, var3));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("mc.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (100 != param1) {
            break L0;
          } else {
            if (ni.field_k > 0) {
              fieldTemp$6 = ni.field_k - 1;
              ni.field_k = ni.field_k - 1;
              var2_ref_byte__ = li.field_a[fieldTemp$6];
              li.field_a[ni.field_k] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 65536) {
            break L1;
          } else {
            mc.a((byte) 100);
            break L1;
          }
        }
        L2: {
          if (5000 != param1) {
            break L2;
          } else {
            if (sg.field_q > 0) {
              fieldTemp$7 = sg.field_q - 1;
              sg.field_q = sg.field_q - 1;
              var2_ref_byte__ = we.field_h[fieldTemp$7];
              we.field_h[sg.field_q] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if ((param1 ^ -1) != -30001) {
            break L3;
          } else {
            if (-1 > (pg.field_f ^ -1)) {
              fieldTemp$8 = pg.field_f - 1;
              pg.field_f = pg.field_f - 1;
              var2_ref_byte__ = sj.field_B[fieldTemp$8];
              sj.field_B[pg.field_f] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (null == kc.field_O) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= fl.field_e.length) {
                break L4;
              } else {
                if (fl.field_e[var2] == param1) {
                  if (-1 > (nf.field_i[var2] ^ -1)) {
                    nf.field_i[var2] = nf.field_i[var2] - 1;
                    var3 = kc.field_O[var2][nf.field_i[var2] - 1];
                    kc.field_O[var2][nf.field_i[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static void a(int param0, hl[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if ((param2 ^ -1) < -1) {
                  L2: {
                    var6_int = param1[0].field_x;
                    var7 = param1[2].field_x;
                    var8 = param1[1].field_x;
                    if (param0 == 100) {
                      break L2;
                    } else {
                      mc.a((byte) 61);
                      break L2;
                    }
                  }
                  param1[0].a(param3, param5, param4);
                  param1[2].a(param2 + (param3 + -var7), param5, param4);
                  ki.a(be.field_c);
                  ki.c(var6_int + param3, param5, -var7 + (param3 + param2), param1[1].field_q + param5);
                  var9 = var6_int + param3;
                  var10 = param3 + (param2 + -var7);
                  param3 = var9;
                  L3: while (true) {
                    if (param3 >= var10) {
                      ki.b(be.field_c);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1[1].a(param3, param5, param4);
                      param3 = param3 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("mc.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "Confirm Password: ";
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = "HELIX LASER - Switches the Nova Ray to use the defensive burst of the helix laser.";
        field_g = new byte[65536];
        field_e = "Close";
        ug.a(field_g, 0, 65536, (byte) -128);
    }
}
