/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ab implements dn {
    private mi[] field_t;
    private String[] field_v;
    static Vector2 field_u;
    private bh field_w;
    static String field_x;

    ek(bh param0) {
        super(0, 0, 0, 0, (ir) null);
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        if (param0) {
          field_x = (String) null;
          field_u = null;
          field_x = null;
          return;
        }
        field_u = null;
        field_x = null;
    }

    final static boolean a(byte param0) {
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        Object var1 = ua.field_d;
        synchronized (var1) {
          if (ch.field_a == lt.field_u) {
            return false;
          }
          if (param0 >= -125) {
            ek.a((byte) 107);
          }
          bk.lastKeyCode = ArchiveIndex.field_e[ch.field_a];
          fr.field_e = qb.field_o[ch.field_a];
          ch.field_a = ch.field_a + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        String stackIn_15_2 = null;
        try {
          if (super.a(-1, param1, param2, param3)) {
            return true;
          }
          int var5_int = 114 / ((-53 - param0) / 33);
          if (param1 == 98) {
            boolean stackIn_7_0 = this.b(param3, -24);
            return stackIn_7_0;
          }
          if (99 != param1) {
            return false;
          }
          boolean stackIn_11_0 = this.a(80, param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var5;
          StringBuilder stackIn_14_1 = new StringBuilder().append("ek.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 118, param1, param2, param3);
        if (0 != param1) {
          return;
        }
        BitmapFont var5 = qo.field_b;
        if (null != this.field_v) {
          var5.drawParagraph(r.field_o, param3 + this.field_p, this.field_h + param2, this.field_q, 20, 16777215, -1, 0, 0, var5.maxDescent + var5.maxAscent);
        }
        if (param0 >= 64) {
          return;
        }
        this.a((byte) 54, 31, 107, 46);
    }

    final void a(String[] param0, boolean param1) {
        String stackIn_19_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.field_s.clear(268435455);
          if (param0 != null &&
            param0.length != 0) {
            int var3_int = param0.length;
            this.field_v = new String[var3_int];
            for (int var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_v[var4_int] = ju.a(0, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            wg var4 = new wg(qo.field_b, 0, 1);
            this.field_t = new mi[var3_int + 1];
            if (!param1) {
              return;
            }
            for (int var5 = 0; var3_int > var5; var5++) {
              this.field_t[var5] = new mi(this.field_v[var5], (no) (this));
              this.field_t[var5].field_e = (ir) ((Object) var4);
              this.field_t[var5].field_k = jc.field_wc;
              this.field_t[var5].a(15, 0, 20 + var5 * 16, 80, (byte) 124);
              this.a(this.field_t[var5], 1);
            }
            this.field_t[var3_int] = new mi(mi.field_r, (no) (this));
            this.field_t[var3_int].field_e = (ir) ((Object) var4);
            this.field_t[var3_int].a(15, 0, var3_int * 16 + 16 + 20, 100, (byte) 123);
            this.a(this.field_t[var3_int], 1);
            return;
          }
          this.field_v = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3;
          StringBuilder stackIn_18_1 = new StringBuilder().append("ek.W(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        String stackIn_16_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          for (int var6_int = 0; this.field_v.length > var6_int; var6_int++) {
            if (this.field_t[var6_int] == param1) {
              this.field_w.a(this.field_v[var6_int], 10000536);
            }
          }
          if (param1 == this.field_t[this.field_v.length]) {
            this.field_w.a((byte) -77);
          }
          int var6_intLifetime1 = -47 / ((param4 + 27) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var6;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ek.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
        } else if (65536 <= param1) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param0 < 98) {
          return 58;
        }
        if (16 <= param1) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        return param1 + var2;
    }

    static {
        field_u = new Vector2();
        field_x = "Connection restored.";
    }
}
