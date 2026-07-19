/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static hh field_i;
    static String field_e;
    static int field_m;
    private boolean field_b;
    static int[] field_k;
    static ed field_l;
    static String[] field_j;
    private int field_f;
    private String field_h;
    private mf field_d;
    private String field_a;
    private int[] field_g;
    private ed field_c;

    final ed b(int param0) {
        int var2 = 0;
        Object var3 = null;
        byte[] var3_array = null;
        if (this.field_c == null) {
          if (this.field_b) {
            if (this.field_d.a(0, this.field_a)) {
              var2 = 5 % ((-30 - param0) / 48);
              if (this.field_f != 0) {
                if ((this.field_f ^ -1) == -2) {
                  L0: {
                    var3_array = null;
                    if (this.field_g == null) {
                      var3_array = this.field_d.a(-4, this.field_h, this.field_a);
                      break L0;
                    } else {
                      var3_array = this.field_d.a((byte) 78, this.field_a, this.field_h, this.field_g);
                      break L0;
                    }
                  }
                  this.field_c = new ed(var3_array, (java.awt.Component) ((Object) of.field_d));
                  return this.field_c;
                } else {
                  return this.field_c;
                }
              } else {
                this.field_c = fe.a(this.field_a, this.field_d, this.field_h, true);
                return this.field_c;
              }
            } else {
              return null;
            }
          } else {
            var2 = 5 % ((-30 - param0) / 48);
            if (this.field_f != 0) {
              if ((this.field_f ^ -1) != -2) {
                return this.field_c;
              } else {
                L1: {
                  var3_array = null;
                  if (this.field_g == null) {
                    var3_array = this.field_d.a(-4, this.field_h, this.field_a);
                    break L1;
                  } else {
                    var3_array = this.field_d.a((byte) 78, this.field_a, this.field_h, this.field_g);
                    break L1;
                  }
                }
                this.field_c = new ed(var3_array, (java.awt.Component) ((Object) of.field_d));
                return this.field_c;
              }
            } else {
              this.field_c = fe.a(this.field_a, this.field_d, this.field_h, true);
              return this.field_c;
            }
          }
        } else {
          return this.field_c;
        }
    }

    final static void a(mf param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              hb.field_b = new ed[7][3];
              qi.field_M = new ed[7][3];
              if (param1 == -23) {
                break L1;
              } else {
                qh.a(-112);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (on.field_f.length <= var2_int) {
                break L0;
              } else {
                L3: {
                  var3 = on.field_f[var2_int];
                  if (var3 == null) {
                    break L3;
                  } else {
                    if (-1 == (var3.length() ^ -1)) {
                      break L3;
                    } else {
                      var4 = "";
                      hb.field_b[var2_int] = kh.a(param0, (byte) -112, var4, var3);
                      var5 = lm.field_b[var2_int];
                      if (var5 == null) {
                        break L3;
                      } else {
                        if (var5.length() == 0) {
                          break L3;
                        } else {
                          qi.field_M[var2_int] = kh.a(param0, (byte) -10, var4, var5);
                          break L3;
                        }
                      }
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("qh.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static void a(rl param0, boolean param1, int param2) {
        c var3 = null;
        try {
            var3 = om.field_c;
            var3.a(param2, param1);
            var3.f(param0.field_i, -123);
            var3.f(param0.field_g, -123);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 7) {
            return;
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_l = null;
    }

    qh(mf param0, String param1, String param2, int param3, boolean param4, int[] param5) {
        try {
            this.field_b = param4 ? true : false;
            this.field_d = param0;
            this.field_f = param3;
            this.field_a = param2;
            this.field_h = param1;
            this.field_g = param5;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{"Sit down, commander. Prepare for mission briefing.", "As you know, aliens broke into Earth's most advanced <photo>weapons and technology installation.<br>They used <photo>cloaking devices and would have made good their escape...", "...had our most powerful items not had tracking devices fitted,<br>allowing us to <photo>track the aliens to their home system.", "Your mission is to take your ship, the OSS Katsuro, into the caves where our equipment is being stored.<br><photo>You must overcome the aliens' defences and recover the equipment.", "Our emergency rescue teleporter has enough power for two transmissions.<br>The aliens will attempt to stop you and we can only save your life twice...", "...so we are relying on your skills as a pilot to win the <title>day for Earth."};
        field_e = "Shield recharged";
    }
}
