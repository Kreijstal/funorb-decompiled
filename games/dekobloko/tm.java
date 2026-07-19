/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_g;
    static jd field_b;
    static int[] field_a;
    static int field_d;
    static String field_e;
    static String[] field_f;
    static String field_h;
    static int field_c;

    final static int a(byte param0) {
        int discarded$1 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_10_0 = false;
        int stackOut_33_0 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!ab.c((byte) 52)) {
                    break L3;
                  } else {
                    k.field_f.a(-111);
                    stackOut_3_0 = k.field_f.b((byte) 114);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          var1_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (wh.field_c == 13) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                k.field_f.a(ub.a(bh.field_g, (byte) -81, pm.field_f), -20563, ub.a(he.field_S, (byte) -81, nf.field_h));
                stackOut_10_0 = k.field_f.b((byte) 114);
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L5: {
                if (stackIn_11_0) {
                  var1_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  L8: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L8;
                    } else {
                      if ((k.field_f.field_h ^ -1) <= -1) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (-3 == (bc.field_B ^ -1)) {
                      break L6;
                    } else {
                      bf.a(false);
                      if (var7 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L9: {
                  var3 = qf.field_i[k.field_f.field_h];
                  if (2 == var3) {
                    break L9;
                  } else {
                    if (-6 == (var3 ^ -1)) {
                      break L9;
                    } else {
                      break L6;
                    }
                  }
                }
                bf.a(false);
                break L6;
              }
              L10: {
                if (param0 <= -88) {
                  break L10;
                } else {
                  discarded$1 = tm.a((byte) 116);
                  break L10;
                }
              }
              L11: {
                if (var3 != 0) {
                  break L11;
                } else {
                  if (2 == bc.field_B) {
                    var4 = ik.a(4) - di.field_F;
                    var6 = (int)((10999L - var4) / 1000L);
                    if (0 >= var6) {
                      var3 = 2;
                      bl.a(-79, 5, true);
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              stackOut_33_0 = var3;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "tm.B(" + param0 + ')');
        }
        return stackIn_34_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_h = null;
        if (param0 <= 87) {
          field_h = (String) null;
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static void b(byte param0) {
        md.field_U[4] = dn.field_j;
        md.field_U[7] = pa.field_W;
        md.field_U[1] = t.field_ib;
        md.field_U[2] = u.field_c;
        md.field_U[3] = kl.field_w;
        md.field_U[6] = l.field_e;
        if (param0 > -30) {
          return;
        } else {
          md.field_U[5] = ea.field_y;
          md.field_U[0] = vf.field_c;
          ac.field_z[ac.field_z.length - 2] = ta.field_g;
          ac.field_z[-1 + ac.field_z.length] = ph.field_zb;
          return;
        }
    }

    static {
        field_e = "You have not yet unlocked this option for use.";
        field_d = 0;
        field_g = "Waiting for music";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_h = "Create your own free Jagex account";
    }
}
