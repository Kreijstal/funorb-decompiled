/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends nn {
    static String field_x;
    static kc field_z;
    static String field_B;
    static String field_y;
    private Object field_A;
    static String field_u;
    static hh field_w;
    static String field_v;

    nh(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_A = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("nh.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        bb.field_e = fd.field_g[param1];
        if (param0) {
          return;
        }
        try {
          vn.field_f = k.field_k[param1];
          ld.field_o = fn.field_c[param1];
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nh.J(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 96) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "nh.F(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, boolean param3) {
        if (param0 != -66) {
          return;
        }
        try {
          vd.a(param1, 121, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nh.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final Object e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 12) {
            field_B = (String) null;
          }
          stackIn_4_0 = this.field_A;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "nh.B(" + param0 + ')');
        }
    }

    public static void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_v = null;
          field_u = null;
          field_y = null;
          field_w = null;
          field_z = null;
          if (param0 > -97) {
            nh.i((byte) 63);
          }
          field_x = null;
          field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "nh.H(" + param0 + ')');
        }
    }

    final static void i(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ab var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        wa var6 = null;
        wa var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        wa var6Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = df.field_z;
          var2 = var1.e((byte) -107);
          if (0 == var2) {
            if (uc.field_c == null) {
              uc.field_c = new mo(128);
              pc.field_b = 0;
            }
            stackIn_12_0 = (var1.e((byte) -125) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.l(-1);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.l(-1);
            }
            var6 = mf.a(-1, var4_ref_String);
            var7_ref = var1.l(-1);
            var8 = gk.a((CharSequence) ((Object) var4_ref_String), -13);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = mf.a(-1, var7_ref);
              if (var6 != null) {
                uc.field_c.a(var6, (long)var8.hashCode(), (byte) 118);
              }
            }
            if (null == var6) {
              var6 = new wa();
              uc.field_c.a(var6, (long)var8.hashCode(), (byte) 126);
              fieldTemp$1 = pc.field_b;
              pc.field_b = pc.field_b + 1;
              var6.field_Bb = fieldTemp$1;
              oo.field_B.b(var6, -1);
            }
            var6.field_Cb = var4_ref_String;
            var6.field_Gb = var7_ref;
            var6.field_Ib = var5;
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              if (jb.field_t == 1) {
                jb.field_t = 2;
              }
              return;
            }
            if (3 == var2) {
              if (jb.field_t == 2) {
                jb.field_t = 1;
              }
              return;
            }
            if (var2 != 4) {
              if (param0 < 20) {
                field_u = (String) null;
              }
              jh.a((Throwable) null, "F1: " + nn.g((byte) -25), (byte) 20);
              ka.b(false);
              return;
            }
            jb.field_t = 1;
            var3 = var1.l(-1);
            ie.field_Nb = ((String) (var3)).intern();
            var4 = var1.e((byte) 110);
            qo.a(2, var4);
            return;
          }
          if (null == ie.field_Qb) {
            ie.field_Qb = new mo(128);
            rc.field_m = 0;
          }
          var3Lifetime1 = var1.l(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.l(-1);
          var5Lifetime1 = var1.l(-1);
          var6Lifetime1 = im.a(0, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = im.a(0, var5Lifetime1);
            if (var6Lifetime1 != null) {
              ie.field_Qb.a(var6Lifetime1, (long)gk.a((CharSequence) ((Object) var4_ref_StringLifetime1), -13).hashCode(), (byte) 119);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new wa();
            ie.field_Qb.a(var6Lifetime1, (long)gk.a((CharSequence) ((Object) var4_ref_StringLifetime1), -13).hashCode(), (byte) 110);
            fieldTemp$0 = rc.field_m;
            rc.field_m = rc.field_m + 1;
            var6Lifetime1.field_Bb = fieldTemp$0;
            vd.field_d.b(var6Lifetime1, -1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Gb = var5Lifetime1;
          var6Lifetime1.field_Cb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Lb = (String) (var3Lifetime1);
          var6Lifetime1.a(true);
          var7 = (wa) (vd.field_d.b(12623));
          while (null != var7) {
            if (qa.a(false, var6Lifetime1, var7)) {
              var7 = (wa) (vd.field_d.a(0));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (var7 != null) {
            da.a(var7, 20, var6Lifetime1);
            if (var9 == 0) {
              return;
            }
          }
          vd.field_d.b(var6Lifetime1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "nh.I(" + param0 + ')');
        }
    }

    static {
        field_x = "Invite <%0> to this game";
        field_y = "Concluded";
        field_u = "Your ignore list is full. Max of 100 hit.";
        field_v = "Email is valid";
        field_B = "No";
    }
}
