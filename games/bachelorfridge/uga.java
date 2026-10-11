/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uga extends ana {
    static String field_A;
    private wfa field_z;
    static int field_y;
    static kv field_C;
    static vr field_B;
    static int field_v;
    static String field_w;
    static int field_x;

    final static boolean e(int param0) {
        if (param0 != 37) {
          field_B = (vr) null;
          return true;
        }
        return true;
    }

    public static void f(byte param0) {
        field_A = null;
        field_w = null;
        if (param0 != 21) {
          return;
        }
        field_B = null;
        field_C = null;
    }

    uga(gj param0, wfa param1) {
        super(param0, param1);
        try {
          this.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        iv var3_ref = null;
        ad var7 = null;
        Object var3 = null;
        int var5 = BachelorFridge.field_y;
        aga var6 = this.field_z.field_l.a(96, this.field_q.field_h);
        if (param0 >= -78) {
          this.e((byte) 27);
        }
        if (!var6.i(-83)) {
          var3_ref = (iv) (this.field_z.field_o.b((byte) 90));
          al.a(-86, this.field_z.field_k);
          while (var3_ref != null) {
            var3_ref.a(var6, this.field_q.field_h, 12);
            var7 = var3_ref.field_h.a(-27449, this.field_q);
            var7.b(-1, 6);
            this.a(27799, new ek(this.field_q, this.field_z.field_l.a(-27449, this.field_q), -200));
            var3_ref = (iv) (this.field_z.field_o.c(0));
          }
          return;
        }
    }

    private final void d(int param0) {
        if (param0 > -10) {
          field_w = (String) null;
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder var12 = null;
        StringBuilder discarded$0 = null;
        StringBuilder var13 = null;
        StringBuilder discarded$1 = null;
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = BachelorFridge.field_y;
        int var3Lifetime1;
        long var4Lifetime1;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param1 <= 43) {
          field_w = (String) null;
          if (param0 <= 0L) {
            return null;
          }
          if (6582952005840035281L <= param0) {
            return null;
          }
          if (param0 % 37L != 0L) {
            var3 = 0;
            var4 = param0;
            while (var4 != 0L) {
              var3++;
              var4 = var4 / 37L;
            }
            var12 = new StringBuilder(var3);
            while (param0 != 0L) {
              var7 = param0;
              param0 = param0 / 37L;
              var9 = ga.field_a[(int)(-(param0 * 37L) + var7)];
              if (var9 == 95) {
                var10 = var12.length() - 1;
                var9 = 160;
                var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
              }
              discarded$0 = var12.append((char) var9);
            }
            var12.reverse();
            var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
            return var12.toString();
          }
          return null;
        }
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param0 % 37L != 0L) {
          var3Lifetime1 = 0;
          var4Lifetime1 = param0;
          while (var4Lifetime1 != 0L) {
            var3Lifetime1++;
            var4Lifetime1 = var4Lifetime1 / 37L;
          }
          var13 = new StringBuilder(var3Lifetime1);
          while (param0 != 0L) {
            var7Lifetime1 = param0;
            param0 = param0 / 37L;
            var9Lifetime1 = ga.field_a[(int)(-(param0 * 37L) + var7Lifetime1)];
            if (var9Lifetime1 == 95) {
              var10Lifetime1 = var13.length() - 1;
              var9Lifetime1 = 160;
              var13.setCharAt(var10Lifetime1, Character.toUpperCase(var13.charAt(var10Lifetime1)));
            }
            discarded$1 = var13.append((char) var9Lifetime1);
          }
          var13.reverse();
          var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
          return var13.toString();
        }
        return null;
    }

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l != 25) {
            return false;
          }
          wf.a(22, (byte) 126);
          this.e((byte) -90);
          return false;
        }
        this.d(-63);
        int var2 = -17 / ((71 - param0) / 47);
        return true;
    }

    static {
        field_A = "That name is not available";
        field_y = 0;
        field_v = 12320512;
        field_w = "Shopping bag. Click the tooltips to continue.";
        field_x = 0;
    }
}
