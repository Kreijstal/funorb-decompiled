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
        pd stackIn_2_0 = null;
        pd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 20) {
              var2 = new pd(param1, param1);
              bk.field_d.a(false, var2);
              qg.field_f.a(param1);
              stackIn_4_0 = (pd) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("sg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ii.a(param1 + 96, param0)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var2 = ei.field_m;
                  var3 = 0;
                  if (param1 == -95) {
                    break L1;
                  } else {
                    sg.a(false, -117);
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var2.length <= var3) {
                    var2 = sa.field_a;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param0) {
                          var3++;
                          continue L3;
                        } else {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var2[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L2;
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "sg.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    final static sg a(boolean param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ih var8 = null;
        aj var9 = null;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          var8 = ae.field_a;
          var3 = var8.e(false);
          if (0 == (var3 & 128)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          ll.field_j = stackIn_3_0 != 0;
          d.field_N = 127 & var3;
          gm.field_ob = var8.e(false);
          ki.field_b = var8.f(-83);
          if ((d.field_N ^ -1) == -3) {
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
          if ((var8.e(false) ^ -1) != -2) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
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
            if (-2 == (d.field_N ^ -1)) {
              break L5;
            } else {
              if (-5 == (d.field_N ^ -1)) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          var8.d((byte) -121);
          var8.h(0);
          break L4;
        }
        L6: {
          if (param1 >= 22) {
            break L6;
          } else {
            field_f = (dd) null;
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
                  if (qi.field_d.equals(b.field_e)) {
                    stackIn_24_0 = null;
                    break L9;
                  } else {
                    stackIn_24_0 = var9.field_z;
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
                ud.a("CC1", (Throwable) ((Object) var6), 0);
                l.field_c = null;
                wf.field_d = null;
                break L10;
              }
            }
            break L7;
          } else {
            wf.field_d = tf.a(var8, 0, 80);
            l.field_c = null;
            break L7;
          }
        }
        return new sg(param0);
    }

    final int b(int param0) {
        L0: {
          if (this.field_k) {
            break L0;
          } else {
            L1: {
              if (-3 != (this.field_j ^ -1)) {
                break L1;
              } else {
                if (0 < this.field_d) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (jc.field_b == this.field_g) {
              return 1;
            } else {
              L2: {
                if (-3 != (nb.field_i ^ -1)) {
                  break L2;
                } else {
                  if (ef.a((byte) 119, this.field_m)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == 0) {
                return 0;
              } else {
                this.b(53);
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
            this.field_c = null;
        } else {
            this.field_c = l.field_c;
        }
        this.field_j = d.field_N;
        this.field_e = jd.field_t;
        this.field_l = wf.field_d;
        this.field_g = ki.field_b;
        this.field_b = ga.field_o;
        this.field_k = ll.field_j;
        this.field_m = qi.field_d;
        this.field_d = gm.field_ob;
    }

    static {
        field_i = new rd();
    }
}
