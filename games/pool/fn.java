/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends vh {
    static String field_Mb;
    static String field_Lb;
    static String field_Ob;
    static String field_Nb;
    static String field_Qb;
    private vh field_Pb;

    final static boolean f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == -13164) {
                break L1;
              } else {
                fn.f(89);
                break L1;
              }
            }
            o.field_y = o.field_y + 1;
            if (pq.field_B.length <= o.field_y) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var1_int = 0;
              L2: while (true) {
                if (pc.field_a.length <= var1_int) {
                  pc.field_a = pq.field_B[o.field_y];
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  pq.field_B[o.field_y][var1_int].a(pc.field_a[var1_int], (byte) -12);
                  var1_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "fn.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static im b(long param0, int param1) {
        String var4;
        if (param1 != 0) {
          var4 = (String) null;
          fn.a((String) null, -19, (String) null, -83, true, (String) null, -49);
          return (im) ((Object) im.field_Qb.a(param0, false));
        } else {
          return (im) ((Object) im.field_Qb.a(param0, false));
        }
    }

    final boolean b(byte param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (param0 == -52) {
          this.a(true, false);
          if (-1 == (ne.field_s ^ -1)) {
            if (-1 != (this.field_Pb.field_R ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (-1 != (this.field_R ^ -1)) {
              L0: {
                if (-1 == (this.field_Pb.field_R ^ -1)) {
                  stackIn_10_0 = 0;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackIn_6_0 = 1;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final static an a(byte param0, byte[] param1) {
        an var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        an stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new an(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, v.field_b);
                sh.h(-1);
                if (param0 >= 119) {
                  break L1;
                } else {
                  fn.f(-82);
                  break L1;
                }
              }
              stackIn_6_0 = (an) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("fn.F(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (an) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static int a(pn param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        pn var4 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              var2_int = mc.field_g;
              if ((param0.field_p ^ -1) == -3) {
                if (param0.field_g) {
                  var2_int = mc.field_g;
                  break L1;
                } else {
                  L2: {
                    if (param0.field_m != 0) {
                      break L2;
                    } else {
                      if (param0.field_e != 0) {
                        break L2;
                      } else {
                        var2_int = pq.field_F[param0.field_p];
                        break L1;
                      }
                    }
                  }
                  var2_int = ng.field_A[param0.field_p];
                  break L1;
                }
              } else {
                if ((param0.field_p ^ -1) != -5) {
                  if ((ve.field_m ^ -1L) == (param0.field_b ^ -1L)) {
                    var2_int = pq.field_F[param0.field_p];
                    break L1;
                  } else {
                    var2_int = ng.field_A[param0.field_p];
                    break L1;
                  }
                } else {
                  var2_int = ng.field_A[param0.field_p];
                  break L1;
                }
              }
            }
            L3: {
              if (param1 <= -30) {
                break L3;
              } else {
                var4 = (pn) null;
                fn.a((pn) null, 64);
                break L3;
              }
            }
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("fn.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        var2 = ir.field_h * ir.field_h;
        var3 = -(param1 * param1) + var2;
        ff.a(-24, qh.field_f - 120 + var3 * 120 / var2);
        if (param0 != 5938) {
          field_Nb = (String) null;
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 <= 12) {
            String var2 = (String) null;
            fn.a((String) null, -57, (String) null, 61, false, (String) null, 44);
            field_Mb = null;
            field_Qb = null;
            field_Ob = null;
            field_Lb = null;
            return;
        }
        field_Mb = null;
        field_Qb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static int a(String param0, int param1, String param2, int param3, boolean param4, String param5, int param6) {
        ke var7 = null;
        RuntimeException var7_ref = null;
        ke var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 50) {
                break L1;
              } else {
                field_Lb = (String) null;
                break L1;
              }
            }
            var7 = new ke(param2);
            var8 = new ke(param0);
            stackIn_3_0 = ih.a(param5, (byte) 87, param1, param4, var7, var8, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("fn.C(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    fn(vh param0, vh param1, vh param2, vh param3, vh param4, vh param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        vh var8 = null;
        vh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vh var13 = null;
        vh var14 = null;
        int var15 = 0;
        vh var16 = null;
        try {
          L0: {
            var16 = new vh(0L, param1, w.field_m.toUpperCase());
            var16.field_Fb = 1;
            this.field_Pb = new vh(0L, param2);
            var8 = new vh(0L, param3);
            var9 = new vh(0L, param3, jd.field_j);
            var9.field_Fb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (bj.field_o.length <= var12) {
                var16.b(0, 2147483647, 0, 20 + var11 - -90, 24);
                var10 += 15;
                this.b(100, 2147483647, 100, var16.field_gb, var10 - -var16.field_Db);
                this.field_Pb.b(5, 2147483647, -20 + var16.field_gb, 15, 15);
                var8.b(var16.field_Db, 2147483647, 0, this.field_gb, this.field_Db - var16.field_Db);
                var9.b(20, 2147483647, 0, this.field_gb, 15);
                var8.field_F = rp.a(32450, 3, 2105376, var8.field_Db, 11579568, 8421504);
                var16.a(-115, this.field_Pb);
                var8.a(-122, var9);
                this.a(-95, var16);
                this.a(-110, var8);
                this.field_qb = -(this.field_gb >> -1470712895) + 320;
                var10 = 240 - (this.field_Db >> -642501663);
                break L0;
              } else {
                L2: {
                  var13 = new vh(0L, param3, ck.field_T[var12]);
                  var14 = new vh(0L, param3, bj.field_o[var12]);
                  var15 = param3.field_I.b(bj.field_o[var12]);
                  var13.b(var10, 2147483647, 20, 65, 15);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.b(var10, 2147483647, 90, 640, 15);
                var8.a(-126, var13);
                var10 += 30;
                var8.a(-98, var14);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("fn.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    static {
        field_Mb = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_Lb = "Add <%0> to friend list";
        field_Ob = "To <u=ffffff>rotate</u> around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and move the mouse. Try it now to move on.";
        field_Nb = "Music: ";
        field_Qb = "You cannot add yourself!";
    }
}
