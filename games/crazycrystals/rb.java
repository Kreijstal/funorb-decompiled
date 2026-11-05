/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ue {
    static db field_k;
    static String field_e;
    private re field_f;
    static String field_i;
    static am field_g;
    static int field_h;
    static String field_j;

    public static void c(byte param0) {
        field_k = null;
        field_e = null;
        field_j = null;
        if (param0 == 100) {
          field_i = null;
          field_g = null;
          return;
        }
        field_g = (am) null;
        field_i = null;
        field_g = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 126) {
            rb.c((byte) -62);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (ck.a((byte) -29, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("rb.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    rb(re param0, boolean param1) {
        super(0);
        try {
          this.field_f = param0;
          ip.a(0, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        dl var3;
        if (null != ga.field_L) {
          boolean decompiledFrameRemainder0 = true;
          if (!tf.field_c) {
            if (!ga.field_L.a(param0 ^ -20410, "benefits")) {
              if (!ob.field_o &&
                ga.field_L.a(param0 ^ -20410, "screenshots")) {
                bm.a(6437, bf.a(-1, "screenshots", "screenshots", ga.field_L));
                ob.field_o = true;
                vp.a(127);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              wb.a(0, wl.a("main", ga.field_L, param0 + 2, "benefits"), ei.field_G);
              sj.a(wl.a("crystal", ga.field_L, 10, "benefits"), -2, 17, 10, 107, 71, 40, 2500, (byte) 113);
              var3 = new dl(ee.field_m.field_n / 3 + 6, 6 + ee.field_m.field_o / 3);
              var3.a();
              ee.field_m.d(3, 3, ee.field_m.field_n / 3, ee.field_m.field_o / 3);
              dk.field_o.a(6945);
              hb.a(3, var3.field_o, 0, var3.field_n, var3, -126, 1, 0);
              fo.a(param0 ^ -12, var3);
              tf.field_c = true;
              vp.a(107);
            }
          }
          if ((decompiledFrameRemainder0) && (!ob.field_o &&
            ga.field_L.a(param0 ^ -20410, "screenshots"))) {
            bm.a(6437, bf.a(-1, "screenshots", "screenshots", ga.field_L));
            ob.field_o = true;
            vp.a(127);
          }
          if (tf.field_c &&
            ob.field_o) {
            ga.field_L = null;
          }
        }
        this.field_f.b(param0);
        if (this.field_f.field_f != 0) {
          return;
        }
        la.b(-79);
    }

    final boolean a(int param0) {
        if (param0 < 99) {
          return true;
        }
        return false;
    }

    final void a(boolean param0) {
        int var2;
        this.field_f.c(-1);
        if (0 != this.field_f.field_f) {
          if (!param0) {
            return;
          }
          this.a(96);
          return;
        }
        var2 = da.a(true, true);
        if (3 == var2) {
          q.a(param0);
          on.a(95, le.b((byte) -20));
        }
        if (var2 == 1) {
          a.field_b = (ue) ((Object) this.field_f);
          this.field_f.a(false, -13880);
        }
        if (var2 == 2) {
          a.field_b = (ue) ((Object) this.field_f);
          this.field_f.a(true, -13880);
        }
        if (!param0) {
          return;
        }
        this.a(96);
        return;
    }

    static {
        field_e = "Bouncy Ball";
        field_i = "... otherwise this crystal will be trapped!";
        field_j = "This is a safe.<br><br>Look for a key. Safes<br>open when you collect a<br>matching key. The safes<br>usually contain crystals,<br>so you'll probably need to open them to complete the level.";
    }
}
