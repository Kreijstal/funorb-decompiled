/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    byte field_n;
    byte field_g;
    or field_d;
    static int field_b;
    static int field_l;
    boolean field_c;
    or field_f;
    private byte field_e;
    static String field_j;
    or field_i;
    static String field_m;
    static int field_a;
    static int field_h;
    static String[] field_k;

    public static void a(boolean param0) {
        field_m = null;
        if (param0) {
          return;
        }
        field_k = null;
        field_j = null;
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        mb var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -19261) {
            field_j = (String) null;
          }
          if (param0 == null) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof mb)) {
              throw new IllegalArgumentException();
            }
            var4 = (mb) (param0);
            stackIn_13_0 = var4.a(33);
            return stackIn_13_0;
          }
          var3 = (byte[]) (param0);
          if (param2) {
            stackIn_10_0 = jj.a(var3, (byte) 91);
            return stackIn_10_0;
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("or.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String b(byte param0) {
        if (param0 < 108) {
          return (String) null;
        }
        int var2 = this.field_n;
        if (var2 == 0) {
          return "unresolved";
        }
        if (var2 != 1) {
          if (2 == var2) {
            return "ball " + this.field_e;
          }
          if (var2 == 3) {
            return "wall " + this.field_e;
          }
          if (var2 == 4) {
            return "point " + this.field_e;
          }
          if (var2 != 5) {
            return "invalid";
          }
          return "pocket " + this.field_e;
        }
        return "stop";
    }

    final void a(boolean param0, pq param1) {
        try {
          this.field_n = (byte) 1;
          if (param0) {
            field_m = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, pq param2) {
        this.field_n = (byte) 3;
        this.field_e = (byte)param0;
        this.field_i = new or((int) this.field_g, this);
        if (param1 != -26401) {
          return;
        }
        try {
          param2.field_q = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pq[] param0, int param1, int param2) {
        pq var6 = param0[param1];
        pq var4 = var6;
        pq var5 = param0[this.field_g];
        this.field_i = new or((int) this.field_g, this);
        if (param2 != -5) {
          return;
        }
        try {
          this.field_d = new or(param1, this);
          this.field_e = (byte)param1;
          this.field_n = (byte) 2;
          if (var6.field_q != null &&
            var6.field_q.field_n == 0) {
            var6.field_q.field_e = this.field_g;
            var6.field_q.field_n = (byte) 2;
            var6.field_q.field_d = this.field_i;
          }
          var5.field_q = this.field_i;
          var4.field_q = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(pq param0, int param1, byte param2) {
        this.field_e = (byte)param1;
        this.field_n = (byte) 4;
        this.field_i = new or((int) this.field_g, this);
        if (param2 != 5) {
          return;
        }
        try {
          param0.field_q = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_a = 37;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_3_0 = oj.field_y.equals(hq.a(73, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("or.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var2 = 0 != this.field_g ? 1 : 0;
        if (this.field_i != null) {
          var2 = var2 + this.field_i.a((byte) 2);
        }
        if (this.field_d != null) {
          var2 = var2 + this.field_d.a((byte) 2);
        }
        if (param0 == 2) {
          return var2;
        }
        or.a(true);
        return var2;
    }

    final boolean a(int param0, bf[] param1) {
        bf var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != -5877) {
            this.a((byte) -36);
          }
          if (3 != this.field_n) {
            if (this.field_n == 4) {
              return true;
            }
            return false;
          }
          var3 = param1[this.field_e];
          stackIn_8_0 = (1 == var3.field_b) || (var3.field_d == 1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("or.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        String var2 = null;
        if (null != nl.field_d) {
          var2 = nl.field_d;
          String var1 = var2;
          pn.a((byte) 75, nr.a(new String[]{var2}, -1, lf.field_e));
          nl.field_d = null;
        }
        if (param0 == 4) {
          return;
        }
        field_m = (String) null;
    }

    final void a(int param0, pq param1, int param2) {
        try {
          if (param0 != 23655) {
            pq var5 = (pq) null;
            this.a((pq) null, 49, (byte) -122);
          }
          this.field_n = (byte) 5;
          this.field_e = (byte)param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    or(int param0, or param1) {
        this.field_d = null;
        this.field_c = false;
        this.field_n = (byte) 0;
        this.field_e = (byte) 0;
        this.field_i = null;
        try {
          this.field_g = (byte)param0;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "or.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Accept invitation to <%0>'s game";
        field_j = "Searching for an opponent";
        field_k = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1 One</col>", "<col=9999ff>2 Two</col>", "<col=ff9999>3 Three</col>", "<col=cc99ff>4 Four</col>", "<col=ffcc99>5 Five</col>", "<col=99ff99>6 Six</col>", "<col=cc9966>7 Seven</col>", "<col=999999>8 Eight</col>", "<col=ffff99>9 Nine!</col>"};
    }
}
