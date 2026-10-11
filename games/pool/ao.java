/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends vh {
    of field_Sb;
    static int[] field_Nb;
    static ko field_Lb;
    vh field_Mb;
    vh field_Ob;
    vh field_Qb;
    static int field_Rb;
    static dd field_Pb;

    ao(long param0, ao param1, String param2, String param3) {
        this(param0, param1, param1.field_Sb.field_Sb, param1.field_Sb.field_Mb, param1.field_Ob, param2, param3);
    }

    final static int a(int param0, boolean param1, boolean param2, CharSequence param3) {
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            if (!param1) {
              var11 = (CharSequence) null;
              ao.a(-24, false, false, (CharSequence) null);
            }
            while (var8 < var7) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param0 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
              var8++;
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_36_0 = var6;
            return stackIn_36_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("ao.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_qb = param0;
        this.field_gb = param1;
        this.field_eb = param7;
        this.field_Db = param6;
        int var9 = -61 % ((63 - param2) / 51);
        this.a(param5, param4, 0, param3);
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
          return -9;
        }
        return fb.field_a[param0 & 2047];
    }

    final static void a(byte param0, int param1, lr param2, lr param3) {
        try {
          wj.field_T = param1;
          gj.field_R = param3;
          dq.field_f = param2;
          nj.a(qh.field_f / 2, qh.field_l / 2, 97);
          if (param0 != -83) {
            field_Lb = (ko) null;
          }
          kg.a(param3.field_L, true, param2.field_w + param2.field_L, param3.field_w + param3.field_L, param2.field_L);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ao.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(boolean param0) {
        if (param0) {
          return;
        }
        cb.field_d = 0;
    }

    ao(long param0, vh param1, vh param2, db param3, vh param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Mb = new vh(0L, (vh) null);
          this.field_Sb = new of(0L, this.field_Mb, param2, param3);
          this.field_Ob = new vh(0L, param4);
          this.field_Qb = new vh(0L, param4);
          this.field_Ob.field_nb = param5;
          this.field_Qb.field_nb = param6;
          this.a(28, this.field_Sb);
          this.a(116, this.field_Ob);
          this.a(22, this.field_Qb);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ao.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param3 + this.field_gb) / 2;
        int var6 = -param0 + this.field_Db;
        this.field_Sb.a(param1, -param3 + var6, (byte) -112, param3, this.field_gb, param2, 0);
        this.field_Ob.field_Db = param0;
        this.field_Ob.field_qb = 0;
        this.field_Ob.field_gb = -param3 + var5;
        this.field_Ob.field_eb = var6;
        this.field_Qb.field_qb = var5;
        this.field_Qb.field_gb = this.field_gb - var5;
        this.field_Qb.field_Db = param0;
        this.field_Qb.field_eb = var6;
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_Rb = -33;
        }
        field_Pb = null;
        field_Nb = null;
        field_Lb = null;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + dg.a(param0 ^ 76, "\n", param1, "%0a"));
        if (param0 != 55) {
          field_Pb = (dd) null;
        }
    }

    static {
        field_Nb = new int[]{2, 20, 21, 49, 6, 5, 13};
        field_Rb = 0;
        field_Lb = null;
    }
}
