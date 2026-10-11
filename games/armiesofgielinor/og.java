/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends IntrusiveNode {
    static int field_m;
    static String field_t;
    NodeDeque field_k;
    int field_q;
    static int[] field_p;
    static String field_l;
    String field_o;
    static String field_n;
    static String field_r;
    static String field_u;
    int field_s;

    og(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    final static void a(int param0, boolean param1) {
        if (Spell.field_d == null) {
          if (param0 != 16756) {
            og.a(-87, true);
            return;
          }
          return;
        }
        if (!Spell.field_d.a((byte) 102, param1)) {
          if (param0 != 16756) {
            og.a(-87, true);
            return;
          }
          return;
        }
        Spell.field_d = null;
        if (param0 == 16756) {
          return;
        }
        og.a(-87, true);
    }

    public final String toString() {
        if (this.field_q == rn.field_c) {
          return "Method{" + this.field_o + "}";
        }
        if (gg.field_G == this.field_q) {
          return "Number{" + this.field_o + "}";
        }
        if (gb.field_z == this.field_q) {
          return "Boolean{" + this.field_o + "}";
        }
        if (this.field_q == hf.field_h) {
          return "Char{" + this.field_o + "}";
        }
        if (this.field_q == iu.field_x) {
          return "String{" + this.field_o + "}";
        }
        if (mo.field_j == this.field_q) {
          return "ArgStart";
        }
        if (LeaderEscortCondition.field_d == this.field_q) {
          return "ArgEnd";
        }
        if (this.field_q == sb.field_d) {
          return "ArgComma";
        }
        return "Unknown";
    }

    final static void a(long param0, int param1, String param2) {
        CharSequence var5 = null;
        try {
          qd.field_G = param2;
          rs.field_t = 2;
          var5 = (CharSequence) ((Object) param2);
          wm.field_b = k.a(var5, false);
          dj.field_e = param0;
          hh.a((byte) 118);
          if (param1 != 1) {
            field_r = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "og.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final nd a(int param0, dr[] param1) throws cb, ef {
        int incrementValue$0 = 0;
        nd stackIn_9_0 = null;
        nd stackIn_14_0 = null;
        nd stackIn_17_0 = null;
        nd stackIn_21_0 = null;
        nd stackIn_23_0 = null;
        nd stackIn_27_0 = null;
        nd stackIn_33_0 = null;
        nd stackIn_36_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        og var5 = null;
        int var6 = 0;
        nd[] var7 = null;
        nd[] var8 = null;
        String var9 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if (param0 != 1) {
              og.a(64, true);
            }
            if (this.field_q == rn.field_c) {
              var7 = new nd[this.field_k.b(false)];
              var8 = var7;
              var4 = 0;
              var5 = (og) (this.field_k.first((byte) 106));
              while (var5 != null) {
                incrementValue$0 = var4;
                var4++;
                var7[incrementValue$0] = var5.a(1, param1);
                var5 = (og) (this.field_k.next((byte) 123));
              }
              stackIn_9_0 = na.a(param1, (byte) 2, var8, this.field_o);
              return stackIn_9_0;
            }
            if (this.field_q == gg.field_G) {
              var3_int = Character.toLowerCase(this.field_o.charAt(-1 + this.field_o.length()));
              if (102 == var3_int) {
                stackIn_14_0 = new nd(Float.valueOf(this.field_o).floatValue());
                return stackIn_14_0;
              }
              if (var3_int == 108) {
                stackIn_17_0 = new nd(Long.parseLong(this.field_o.substring(0, this.field_o.length() - 1)));
                return stackIn_17_0;
              }
              if (this.field_o.indexOf('.') != -1) {
                stackIn_21_0 = new nd(Double.valueOf(this.field_o).doubleValue());
                return stackIn_21_0;
              }
              stackIn_23_0 = new nd(Integer.parseInt(this.field_o));
              return stackIn_23_0;
            }
            if (gb.field_z == this.field_q) {
              stackIn_27_0 = new nd(this.field_o.equals("true"));
              return stackIn_27_0;
            }
            if (hf.field_h == this.field_q) {
              var9 = this.field_o.substring(1, -1 + this.field_o.length());
              if (var9.length() != 1) {
                throw new cb("Invalid char value: " + var9);
              }
              stackIn_33_0 = new nd(var9.charAt(0));
              return stackIn_33_0;
            }
            if (iu.field_x == this.field_q) {
              stackIn_36_0 = new nd(this.field_o.substring(1, this.field_o.length() - 1));
              return stackIn_36_0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (NumberFormatException) (Object) decompiledCaughtException;
            throw new cb("NumberFormatException on: " + this.field_o);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_42_0 = var3_ref;
          stackIn_42_1 = new StringBuilder().append("og.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
        field_l = null;
        field_r = null;
        if (!param0) {
          return;
        }
        field_t = null;
        field_u = null;
    }

    og(int param0, int param1, String param2) {
        try {
          this.field_q = param0;
          this.field_o = param2;
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "og.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Most Mana spent";
        field_n = "Tower";
        field_l = "Missions completed: <%0> of <%1>";
        field_r = "(Leader)";
        field_u = "Campaign Selection";
    }
}
