/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ab extends dc implements pi {
    private boolean field_ob;
    static int field_pb;
    private ea field_rb;
    static int field_jb;
    private boolean field_mb;
    static int field_lb;
    private boolean field_qb;
    private boolean field_kb;
    private qi field_nb;

    final void h(byte param0) {
        if (!this.field_F) {
          return;
        }
        this.field_F = false;
        if (this.field_kb) {
          wh.a((byte) -41);
        } else {
          if (this.field_ob) {
            j.b(58);
          }
        }
        if (param0 <= -47) {
          return;
        }
        this.o(87);
    }

    public void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -4) {
            return;
          }
          if (!this.field_mb) {
            sh.a((byte) -116, en.a(param2 ^ -75), "tochangedisplayname.ws");
            return;
          }
          go.a(param2 + 4, 3);
          this.h((byte) -89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ab.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void o(int param0) {
        this.field_rb.a(2121792, 4210752, false);
        nh var2 = new nh(this, this.field_nb, sk.field_b);
        if (param0 <= -12) {
          var2.a(15, ge.field_d, (byte) 69);
          this.a((n) (var2), (byte) -104);
          return;
        }
    }

    ab(qj param0, qi param1, String param2, boolean param3, boolean param4) {
        super(param0, new nh((ab) null, param1, param2), 77, 10, 10);
        try {
          this.field_ob = param4 ? true : false;
          this.field_qb = false;
          this.field_mb = false;
          this.field_kb = param3 ? true : false;
          this.field_nb = param1;
          this.field_rb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_rb.field_K = true;
          this.a(true, this.field_rb);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean n(int param0) {
        if (param0 >= 103) {
          return ak.field_b == sf.field_n ? true : false;
        }
        field_pb = 24;
        return ak.field_b == sf.field_n ? true : false;
    }

    final static java.net.URL a(String param0, String param1, java.net.URL param2, byte param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_40_0 = null;
          java.net.URL stackIn_42_0 = null;
          RuntimeException stackIn_45_0 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7 = 0;
          int var8_int = 0;
          StringBuilder var8 = null;
          Exception var9 = null;
          int var10 = 0;
          var10 = HoldTheLine.field_D;
          try {
            var5 = param2.getFile();
            var7 = -22 / ((param3 + 36) / 60);
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var8_int = var5.indexOf('/', var6 + 1);
                if ((var8_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param4 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var8_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var8_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(var8_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var8_int = var5.indexOf('/', var6 + 1);
                    if (0 <= var8_int) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var8_int);
                        continue;
                      }
                      var6 = var8_int;
                      continue;
                    }
                  }
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var8_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var8_int) {
                      if (param1 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var8_int);
                        continue;
                      }
                      var6 = var8_int;
                      continue;
                    }
                  }
                  var8 = new StringBuilder(var6);
                  discarded$0 = var8.append(var5.substring(0, var6));
                  if (param4 > 0) {
                    discarded$1 = var8.append("/l=");
                    discarded$2 = var8.append(Integer.toString(param4));
                  }
                  if (param0 != null &&
                    0 < param0.length()) {
                    discarded$3 = var8.append("/p=");
                    discarded$4 = var8.append(param0);
                  }
                  if (param1 != null &&
                    param1.length() > 0) {
                    discarded$5 = var8.append("/s=");
                    discarded$6 = var8.append(param1);
                  }
                  if (var5.length() > var6) {
                    discarded$7 = var8.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var8.append('/');
                  }
                  try {
                    stackIn_40_0 = new java.net.URL(param2, var8.toString());
                    return stackIn_40_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var9 = (Exception) (Object) decompiledCaughtException;
                    var9.printStackTrace();
                    stackIn_42_0 = (java.net.URL) (param2);
                    return stackIn_42_0;
                  }
                }
              }
              var6 = var8_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = var5_ref;
            stackIn_45_1 = new StringBuilder().append("ab.V(");
            if (param0 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
            if (param1 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
            if (param2 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        rm var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            this.h((byte) -102);
            return true;
          }
          if (param2 != -78) {
            var6 = (rm) null;
            this.a(-76, (rm) null, 64, 32, -8);
          }
          stackIn_6_0 = super.a(param0, param1, (byte) -78, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ab.T(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        aj.field_d = ei.field_f[param0];
        rg.field_f = lj.field_c[param0];
        pb.field_d = kl.field_r[param0];
        if (param1 <= 76) {
          ab.n(-60);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        nh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nh var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          if (this.field_qb) {
            return;
          }
          stackIn_7_1 = (param2 == 256);
          this.field_mb = stackIn_7_1;
          stackIn_10_1 = (param0);
          this.field_qb = stackIn_10_1;
          this.field_rb.a(8405024, 4210752, false);
          var6 = new nh(this, this.field_nb, param1);
          var4 = var6;
          if (5 != param2) {
            if (param2 == 256) {
              var6.a(88, (tb) (this), lg.field_p);
            } else {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              if (this.field_kb) {
                stackIn_16_2 = lg.field_p;
              } else {
                stackIn_16_2 = kn.field_i;
              }
              ((nh) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2, (byte) 59);
            }
          } else {
            var6.a(11, vn.field_b, (byte) 69);
            var6.a(17, dl.field_n, (byte) 97);
          }
          if (param2 == 3) {
            var6.a(7, ek.field_u, (byte) 122);
          } else {
            if (param2 != 4) {
              if (param2 == 6) {
                var6.a(9, gb.field_d, (byte) 68);
              } else {
                if (param2 == 9) {
                  var6.a(49, (tb) (this), uh.field_e);
                }
              }
            } else {
              var6.a(8, vn.field_a, (byte) 65);
            }
          }
          this.a((n) (var6), (byte) 79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ab.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_pb = -1;
    }
}
