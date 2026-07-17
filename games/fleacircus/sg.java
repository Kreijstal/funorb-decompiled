/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private String field_m;
    String field_l;
    static dd field_f;
    private int field_d;
    static String field_a;
    int field_j;
    int[] field_c;
    static rd field_i;
    private boolean field_k;
    int field_e;
    int field_b;
    private long field_g;
    static td field_h;

    final static pd a(byte param0, ie param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        pd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 20) {
              var2 = new pd(param1, (lh) (Object) param1);
              bk.field_d.a(false, (lh) (Object) var2);
              qg.field_f.a((sh) (Object) param1);
              stackOut_3_0 = (pd) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("sg.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (ii.a(1, param0)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = ei.field_m;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var7 = sa.field_a;
                    var2 = var7;
                    var8 = 0;
                    var3 = var8;
                    L2: while (true) {
                      if (var8 >= var7.length) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        var4 = var7[var8];
                        if (var4 != param0) {
                          var8++;
                          continue L2;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "sg.E(" + param0 + 44 + -95 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final static sg a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ih var8 = null;
        aj var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          var8 = ae.field_a;
          var3 = var8.e(false);
          if (0 == (var3 & 128)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ll.field_j = stackIn_3_0 != 0;
          d.field_N = 127 & var3;
          gm.field_ob = var8.e(false);
          ki.field_b = var8.f(-83);
          if (d.field_N == 2) {
            ga.field_o = var8.d((byte) -60);
            jd.field_t = var8.c(true);
            break L1;
          } else {
            jd.field_t = 0;
            ga.field_o = 0;
            break L1;
          }
        }
        L2: {
          if (var8.e(false) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          ci.field_e = var8.h(0);
          if (var4 == 0) {
            qi.field_d = ci.field_e;
            break L3;
          } else {
            qi.field_d = var8.h(0);
            break L3;
          }
        }
        L4: {
          L5: {
            if (d.field_N == 1) {
              break L5;
            } else {
              if (d.field_N == 4) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          int discarded$2 = var8.d((byte) -121);
          String discarded$3 = var8.h(0);
          break L4;
        }
        L6: {
          if (param1 >= 22) {
            break L6;
          } else {
            field_f = null;
            break L6;
          }
        }
        L7: {
          if (param0) {
            var5 = var8.d((byte) 59);
            try {
              L8: {
                L9: {
                  var9 = nf.field_F.a(32768, var5);
                  wf.field_d = var9.c((byte) 103);
                  if (qi.field_d.equals((Object) (Object) b.field_e)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L9;
                  } else {
                    stackOut_22_0 = var9.field_z;
                    stackIn_24_0 = stackOut_22_0;
                    break L9;
                  }
                }
                l.field_c = stackIn_24_0;
                break L8;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L10: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ud.a("CC1", (Throwable) (Object) var6, 0);
                l.field_c = null;
                wf.field_d = null;
                break L10;
              }
            }
            break L7;
          } else {
            wf.field_d = tf.a((ni) (Object) var8, 0, 80);
            l.field_c = null;
            break L7;
          }
        }
        return new sg(param0);
    }

    final int b(int param0) {
        L0: {
          if (((sg) this).field_k) {
            break L0;
          } else {
            L1: {
              if (((sg) this).field_j != 2) {
                break L1;
              } else {
                if (0 < ((sg) this).field_d) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (jc.field_b == ((sg) this).field_g) {
              return 1;
            } else {
              L2: {
                if (nb.field_i != 2) {
                  break L2;
                } else {
                  if (ef.a((byte) 119, ((sg) this).field_m)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == 0) {
                return 0;
              } else {
                int discarded$2 = ((sg) this).b(53);
                return 0;
              }
            }
          }
        }
        return 2;
    }

    public static void a(int param0) {
        field_i = null;
        field_f = null;
        if (param0 != -3) {
            sg.a(-59);
        }
        field_h = null;
        field_a = null;
    }

    private sg(boolean param0) {
        if (!param0) {
            ((sg) this).field_c = null;
        } else {
            ((sg) this).field_c = l.field_c;
        }
        ((sg) this).field_j = d.field_N;
        ((sg) this).field_e = jd.field_t;
        ((sg) this).field_l = wf.field_d;
        ((sg) this).field_g = ki.field_b;
        ((sg) this).field_b = ga.field_o;
        ((sg) this).field_k = ll.field_j;
        ((sg) this).field_m = qi.field_d;
        ((sg) this).field_d = gm.field_ob;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new rd();
    }
}
