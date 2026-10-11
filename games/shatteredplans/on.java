/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String field_i;
    private pf field_d;
    static boolean field_b;
    static gq field_g;
    private oh field_e;
    static int field_c;
    static String field_f;
    static String field_a;
    static String field_h;

    final oh c(int param0) {
        oh var2 = this.field_d.field_h.field_e;
        int var3 = -32 % ((25 - param0) / 37);
        if (this.field_d.field_h == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_e;
        return var2;
    }

    final static String a(boolean param0) {
        if (param0) {
          on.a(false);
          if (sc.field_q) {
            return null;
          }
          if (ri.field_F > rq.field_e) {
            return null;
          }
          if (!((ri.field_F + de.field_i) <= rq.field_e)) {
            return jq.field_d;
          }
          return null;
        }
        if (sc.field_q) {
          return null;
        }
        if (ri.field_F > rq.field_e) {
          return null;
        }
        if (!((ri.field_F + de.field_i) <= rq.field_e)) {
          return jq.field_d;
        }
        return null;
    }

    final oh b(byte param0) {
        oh var2 = this.field_e;
        if (param0 != -124) {
          field_i = (String) null;
          if (this.field_d.field_h == var2) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_e;
          return var2;
        }
        if (this.field_d.field_h == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_e;
        return var2;
    }

    final oh a(int param0) {
        oh var2 = this.field_d.field_h.field_f;
        if (param0 != 2) {
          field_b = false;
          if (this.field_d.field_h == var2) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_f;
          return var2;
        }
        if (this.field_d.field_h == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_f;
        return var2;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_a = null;
        field_h = null;
        if (param0 != 22256) {
          field_h = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final oh a(boolean param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        oh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_d.field_h.field_f;
          }
          if (var3 == this.field_d.field_h) {
            this.field_e = null;
            stackIn_6_0 = null;
            return (oh) (stackIn_6_0);
          }
          if (param0) {
            field_c = 27;
          }
          this.field_e = var3.field_f;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("on.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    on(pf param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "on.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final oh a(byte param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        oh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -19 / ((param0 - 20) / 59);
          if (param1 == null) {
            var3 = this.field_d.field_h.field_e;
          } else {
            var3 = param1;
          }
          if (this.field_d.field_h == var3) {
            this.field_e = null;
            stackIn_6_0 = null;
            return (oh) (stackIn_6_0);
          }
          this.field_e = var3.field_e;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("on.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final oh a(byte param0) {
        oh var2 = this.field_e;
        if (this.field_d.field_h == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_f;
        if (param0 < 44) {
          on.a(-53, false);
          return var2;
        }
        return var2;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_14_0 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_27_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_46_0 = false;
        int stackIn_51_0 = 0;
        boolean stackIn_56_0 = false;
        boolean stackIn_63_0 = false;
        int stackIn_74_0 = 0;
        boolean stackIn_79_0 = false;
        boolean stackIn_86_0 = false;
        int stackIn_94_0 = 0;
        boolean stackIn_99_0 = false;
        boolean stackIn_106_0 = false;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        if (ce.field_x == null) {
          if (param0 != 1) {
            return;
          }
          if (in.field_g == null) {
            if (cj.field_x &&
              cs.field_i) {
              if (v.field_b &&
                sr.field_h) {
                stackIn_94_0 = 1;
              } else {
                stackIn_94_0 = 0;
              }
              var2 = stackIn_94_0;
              stackIn_99_0 = (param1) && (var2 == 0) && (me.a(45));
              qr.a(stackIn_99_0, (byte) 112);
              if (v.field_b) {
                if (!sr.field_h) {
                  return;
                }
                stackIn_106_0 = (param1) && (me.a(119));
                kh.a(stackIn_106_0, false);
              }
            }
            return;
          }
          in.field_g.a(param1, param0 ^ -74);
          if (cj.field_x &&
            cs.field_i) {
            if (v.field_b &&
              sr.field_h) {
              stackIn_74_0 = 1;
            } else {
              stackIn_74_0 = 0;
            }
            var2Lifetime4 = stackIn_74_0;
            stackIn_79_0 = (param1) && (var2Lifetime4 == 0) && (me.a(45));
            qr.a(stackIn_79_0, (byte) 112);
            if (v.field_b) {
              if (!sr.field_h) {
                return;
              }
              stackIn_86_0 = (param1) && (me.a(119));
              kh.a(stackIn_86_0, false);
            }
          }
          return;
        }
        ce.field_x.a(param1, 81);
        if (param0 != 1) {
          return;
        }
        if (in.field_g == null) {
          if (!cj.field_x) {
            return;
          }
          if (!cs.field_i) {
            return;
          }
          if (v.field_b &&
            sr.field_h) {
            stackIn_14_0 = 1;
          } else {
            stackIn_14_0 = 0;
          }
          var2Lifetime1 = stackIn_14_0;
          stackIn_19_0 = (param1) && (var2Lifetime1 == 0) && (me.a(45));
          qr.a(stackIn_19_0, (byte) 112);
          if (v.field_b) {
            if (!sr.field_h) {
              return;
            }
            stackIn_27_0 = (param1) && (me.a(119));
            kh.a(stackIn_27_0, false);
          }
          return;
        }
        in.field_g.a(param1, param0 ^ -74);
        if (!cj.field_x) {
          return;
        }
        if (!cs.field_i) {
          return;
        }
        if (!v.field_b) {
          var2Lifetime2 = 0;
          stackIn_39_0 = (param1) && (var2Lifetime2 == 0) && (me.a(45));
          qr.a(stackIn_39_0, (byte) 112);
          if (v.field_b) {
            if (!sr.field_h) {
              return;
            }
            stackIn_46_0 = (param1) && (me.a(119));
            kh.a(stackIn_46_0, false);
          }
          return;
        }
        stackIn_51_0 = (!sr.field_h) ? 0 : 1;
        var2Lifetime3 = stackIn_51_0;
        stackIn_56_0 = (param1) && (var2Lifetime3 == 0) && (me.a(45));
        qr.a(stackIn_56_0, (byte) 112);
        if (v.field_b) {
          if (!sr.field_h) {
            return;
          }
          stackIn_63_0 = (param1) && (me.a(119));
          kh.a(stackIn_63_0, false);
        }
    }

    static {
        field_i = "Email (Login):";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_f = "Enter name of friend to delete from list";
        field_g = new gq(0, 2, 2, 1);
        field_h = "Loading fonts";
    }
}
