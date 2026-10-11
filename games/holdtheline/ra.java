/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends u {
    static ci field_Z;
    static String field_fb;
    static int[] field_cb;
    private String field_gb;
    private boolean field_db;
    private String field_eb;
    static hj[] field_X;
    private boolean field_Y;
    static long field_bb;
    private ea field_jb;
    static int field_ab;
    static String field_ib;
    static hj field_hb;

    final void i(byte param0) {
        this.field_jb.field_K = false;
        this.field_db = true;
        int var2 = -107 % ((param0 + 20) / 43);
    }

    final static void m(int param0) {
        if (bl.field_r != null) {
          bl.field_r.f(-38);
          if (param0 < 95) {
            field_cb = (int[]) null;
            return;
          }
          return;
        }
        if (param0 >= 95) {
          return;
        }
        field_cb = (int[]) null;
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = kf.a(param0, (byte) 122);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ag.a(-2821, var4.charAt(0)) &&
              !ag.a(-2821, var4.charAt(var4.length() - 1))) {
              if (param1) {
                var9 = (String) null;
                ra.a((String) null, false);
              }
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (ag.a(-2821, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ra.W(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_ib = null;
        if (param0 <= -104) {
          field_fb = null;
          field_Z = null;
          field_cb = null;
          field_hb = null;
          field_X = null;
          return;
        }
        field_fb = (String) null;
        field_fb = null;
        field_Z = null;
        field_cb = null;
        field_hb = null;
        field_X = null;
    }

    final void a(int param0, int param1, byte param2) {
        super.a(param0, param1, param2);
        de.field_I.b(this.field_eb, (this.field_x >> 1) + param0, param1 + 103, 16777215, -1);
        if (null != this.field_gb) {
          tc.b(20 + param0, -7 + (param1 + 120), 260, 8421504);
          de.field_I.a(this.field_gb, 20 + param0, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, de.field_I.field_G);
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Y != param2) {
            stackIn_5_1 = (param2);
            this.field_Y = stackIn_5_1;
            if (this.field_Y) {
              this.field_jb.a(8405024, 4210752, false);
              this.field_jb.field_K = true;
            } else {
              this.field_jb.a(2113632, 4210752, false);
              if (this.field_db) {
                this.field_jb.field_K = false;
              }
            }
          }
          if (param1 >= -43) {
            var6 = (String) null;
            ra.a((String) null, 66);
          }
          this.field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
          this.field_eb = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ra.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ra(qj param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_gb = param1;
          if (null != this.field_gb) {
            var3_int = de.field_I.b(this.field_gb, 260, de.field_I.field_G);
            this.b(537342017, 300, var3_int + 150);
          }
          this.field_jb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_jb.field_K = true;
          this.field_Y = false;
          this.field_db = false;
          this.a(true, this.field_jb);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (String) null;
            ra.a((String) null, -94);
          }
          var4 = (CharSequence) ((Object) param0);
          stackIn_3_0 = co.field_e.equals(kf.a(var4, (byte) -102));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ra.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static fi a(String param0, int param1) {
        String var2 = null;
        fi var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = HoldTheLine.field_D;
        try {
          if (jo.field_b == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (fi) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = kf.a(var7, (byte) 99);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (fi) (stackIn_10_0);
          }
          var4 = 70 % ((param1 - 9) / 33);
          var3 = (fi) (jo.field_b.a(-25839, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var8 = (CharSequence) ((Object) var3.field_mb);
            var5 = kf.a(var8, (byte) 123);
            if (!var5.equals(var2)) {
              var3 = (fi) (jo.field_b.a(20240));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ra.CA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_fb = "<img=4>";
        field_cb = new int[]{3, 3, 4};
        field_ab = -1;
        field_ib = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
