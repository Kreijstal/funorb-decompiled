/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends gn {
    int field_l;
    static int field_g;
    static js field_h;
    static double field_f;
    static hu field_e;
    long field_i;
    static ut field_j;
    static int field_n;
    int field_k;
    static StringBuilder field_m;

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 46) {
            field_j = (ut) null;
        }
        field_m = null;
        field_e = null;
    }

    public final String toString() {
        String var1;
        int var2;
        String var3;
        String var4;
        L0: {
          var2 = Kickabout.field_G;
          var3 = "Auction Log [";
          var1 = var3;
          var1 = var3;
          if (-1 != (this.field_k ^ -1)) {
            if (this.field_k != 1) {
              if ((this.field_k ^ -1) == -3) {
                var1 = var3 + "Own]";
                break L0;
              } else {
                if ((this.field_k ^ -1) == -4) {
                  var1 = var3 + "Outbid]";
                  break L0;
                } else {
                  var1 = var3 + "NO TYPE]";
                  break L0;
                }
              }
            } else {
              var1 = var3 + "Buy]";
              break L0;
            }
          } else {
            var1 = var3 + "Bid]";
            break L0;
          }
        }
        var4 = var1 + ", [INDEX==" + this.field_l + "]";
        var1 = var4 + ", [ID==" + this.field_i + "]\n";
        return var1;
    }

    final static int a(int param0) {
        if (param0 != 1315216324) {
            cq.a(0);
        }
        return fc.field_a + (q.field_b << -763402398) + (ng.field_a << 1315216324);
    }

    final static uo a(int param0, sj param1, int param2, int param3, sj param4) {
        RuntimeException var5 = null;
        java.applet.Applet var6 = null;
        uo stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (cu.a(param2, param4, param3, 123)) {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  var6 = (java.applet.Applet) null;
                  cq.a((java.applet.Applet) null, (byte) -14);
                  break L1;
                }
              }
              stackIn_6_0 = tt.a(12015, param1.b(param3, -32669, param2));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("cq.H(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 126) {
                field_h = (js) null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, String param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param0 ^ -1) != -4) {
              if (6 != param0) {
                if ((param0 ^ -1) == -8) {
                  stackIn_9_0 = fv.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param0 ^ -1) != -9) {
                    if (-10 == (param0 ^ -1)) {
                      stackIn_16_0 = cv.field_g;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param0 == 10) {
                        stackIn_20_0 = vs.field_c;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0 == 11) {
                          stackIn_24_0 = go.field_a;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L1: {
                            if (param2 >= 101) {
                              break L1;
                            } else {
                              cq.b(68);
                              break L1;
                            }
                          }
                          if ((param0 ^ -1) == -15) {
                            stackIn_30_0 = vo.a((byte) -18, nm.field_a, new String[]{param1});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_12_0 = rc.field_e;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = bg.field_s;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = ol.field_E;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("cq.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_30_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        ir.a(param0, param1 + 16355);
        if (param1 != 0) {
            field_m = (StringBuilder) null;
        }
        rg.a((byte) -125, param0);
    }

    final static ut[] a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var7 = Kickabout.field_G;
        ut[] var8 = new ut[9];
        ut[] var4 = var8;
        var8[0] = lh.a(param2, (byte) -96, param0);
        for (var5 = 1; (var5 ^ -1) > -10; var5++) {
            var8[var5] = var8[0];
        }
        int var6 = -119 % ((param3 - 38) / 60);
        var8[4] = lh.a(param1, (byte) -96, 64);
        return var4;
    }

    cq(int param0, int param1, long param2) {
        this.field_i = param2;
        this.field_l = param1;
        this.field_k = param0;
    }

    cq(iw param0) {
        int var2_int = 0;
        try {
            param0.h((byte) -126);
            var2_int = param0.h((byte) -124);
            this.field_k = var2_int & 15;
            this.field_l = (15 & var2_int >> -660378780) + -1;
            this.field_i = param0.i((byte) -124);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "cq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 15137) {
          L0: {
            L1: {
              if (la.a(100)) {
                break L1;
              } else {
                if (2 > tk.field_Ib) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        ll var3 = null;
        RuntimeException var3_ref = null;
        ll stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param2 < param0.length) {
                var3 = new ll();
                ((pf) ((Object) var3)).a(param0, 21820);
                stackIn_6_0 = (ll) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!param1) {
                  stackIn_11_0 = (byte[]) (param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = vq.a(82, param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("cq.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    static {
        field_h = (js) ((Object) new hj());
        field_m = new StringBuilder(80);
    }
}
