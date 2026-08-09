/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static th field_a;
    private io field_c;
    private ul field_h;
    private ul field_f;
    static ja field_b;
    static ja[] field_d;
    static String field_g;
    static ja field_e;

    final ob a(int param0, int param1) {
        ob var3;
        byte[] var4;
        ob var5;
        var3 = (ob) (this.field_c.a((byte) 127, (long)param0));
        if (var3 == null) {
          L0: {
            L1: {
              if (32768 > param0) {
                break L1;
              } else {
                var4 = this.field_h.a(0, true, 32767 & param0);
                if (!ZombieDawnMulti.field_E) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_f.a(0, true, param0);
            break L0;
          }
          var5 = new ob();
          if (var4 == null) {
            if (-32769 < (param0 ^ -1)) {
              this.field_c.a(var5, (long)param0, 1);
              if (param1 != 32767) {
                this.field_c = (io) null;
                return var5;
              } else {
                return var5;
              }
            } else {
              var5.e((byte) -72);
              this.field_c.a(var5, (long)param0, 1);
              if (param1 != 32767) {
                this.field_c = (io) null;
                return var5;
              } else {
                return var5;
              }
            }
          } else {
            var5.a(64, new k(var4));
            if (-32769 >= (param0 ^ -1)) {
              var5.e((byte) -72);
              this.field_c.a(var5, (long)param0, 1);
              if (param1 == 32767) {
                return var5;
              } else {
                this.field_c = (io) null;
                return var5;
              }
            } else {
              this.field_c.a(var5, (long)param0, 1);
              if (param1 != 32767) {
                this.field_c = (io) null;
                return var5;
              } else {
                return var5;
              }
            }
          }
        } else {
          return var3;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
          ig.a((byte) -89, 58, false, -109);
          field_b = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          return;
        }
    }

    ig(int param0, ul param1, ul param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new io(64);
        try {
          L0: {
            L1: {
              this.field_f = param1;
              this.field_h = param2;
              if (this.field_f == null) {
                break L1;
              } else {
                this.field_f.d(0, -2);
                break L1;
              }
            }
            if (this.field_h != null) {
              this.field_h.d(0, -2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        cj stackIn_27_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        cj var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ka var9 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (t.field_e < b.field_d) {
                t.field_e = t.field_e + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (km.field_cb != dl.field_h.field_f) {
                vj.field_t = vj.field_t + (dl.field_h.field_f + -km.field_cb);
                km.field_cb = dl.field_h.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 >= t.field_e) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                lk.g((byte) 93);
                dq.field_k.a(-11838, param2);
                if (ra.field_f != null) {
                  if (nh.field_m) {
                    ra.field_f.a(dq.field_k.field_w, (byte) -27, dq.field_k.field_qb, param2);
                    break L3;
                  } else {
                    ra.field_f = null;
                    if (var7 == 0) {
                      break L3;
                    } else {
                      ra.field_f.a(dq.field_k.field_w, (byte) -27, dq.field_k.field_qb, param2);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              var4_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4_int >= 5) {
                      break L6;
                    } else {
                      var5 = la.field_h[var4_int];
                      stackIn_27_0 = (cj) (var5);

                      if (var7 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_27_0 == null) {
                            break L7;
                          } else {
                            L8: {
                              if (var5.field_T != 0) {
                                cm.a(-105, var4_int, var5);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var6 = ga.a(var4_int, true);
                            pf.field_d[var4_int].field_rb = wp.field_j[var6];
                            hh.field_l[var4_int].field_wb = vg.field_h[var6];
                            break L7;
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackIn_27_0 = nn.field_b;
                  break L5;
                }
                L9: {
                  if (stackIn_27_0.field_T != 0) {
                    bk.field_i = new fa(nn.field_b.field_w, nn.field_b.field_qb, nn.field_b.field_zb, nn.field_b.field_z, param3, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, (String) null, 0L);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var9 = km.b(-7, param1, jk.field_f, nj.field_h);
                  if (var9 != null) {
                    kj.a(-31806, var9);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var8 = jp.a((byte) -104);
                  if (var8 != null) {
                    ui.field_j = var8;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var6 = -44 % ((-68 - param0) / 36);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ig.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = new th();
        field_g = "Research Points: <%0>";
    }
}
