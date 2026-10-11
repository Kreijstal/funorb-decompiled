/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private mg[] field_d;
    private boolean field_c;
    static e field_a;
    private int field_b;
    private String field_f;
    private boolean field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 80 % ((param0 - 73) / 32);
    }

    final static int a(byte param0, vk param1) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        vk var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param1.field_r) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param1.field_j == null) {
            stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if (param0 < 6) {
            var6 = (vk) null;
            kg.a((byte) 14, (vk) null);
          }
          var2_int = 0;
          if (0 != param1.field_o) {
            if (param1.field_o == 1) {
              if (a.field_F.b((byte) 10)) {
                var2_int += 16;
              }
              if (hf.field_h.b((byte) 10)) {
                var2_int += 16;
              }
            } else {
              if (2 != param1.field_o) {
                if (param1.field_o == 3) {
                  if (kc.field_b.b((byte) 10)) {
                    var2_int += 16;
                  }
                  if (ug.field_b.b((byte) 10)) {
                    var2_int += 16;
                  }
                } else {
                  if (4 != param1.field_o) {
                    if (5 != param1.field_o) {
                      if (param1.field_o == 6) {
                        if (hg.field_Q.b((byte) 10)) {
                          var2_int += 16;
                        }
                        if (fd.field_e.b((byte) 10)) {
                          var2_int += 16;
                        }
                      }
                    } else {
                      if (ha.field_i.b((byte) 10)) {
                        var2_int += 16;
                      }
                      if (kc.field_b.b((byte) 10)) {
                        var2_int += 16;
                      }
                    }
                  } else {
                    if (ug.field_b.b((byte) 10)) {
                      var2_int += 16;
                    }
                    if (ha.field_i.b((byte) 10)) {
                      var2_int += 16;
                    }
                  }
                }
              } else {
                if (a.field_F.b((byte) 10)) {
                  var2_int += 16;
                }
                if (lk.field_a.b((byte) 10)) {
                  var2_int += 16;
                }
              }
            }
          } else {
            if (ol.field_h.b((byte) 10)) {
              var2_int += 16;
            }
            if (fd.field_e.b((byte) 10)) {
              var2_int += 16;
            }
          }
          var3 = 0;
          for (var4 = 0; param1.field_j.length > var4; var4++) {
            if (param1.field_j[var4].field_c) {
              var3++;
            }
          }
          var2_int = var2_int + var3 * 224 / param1.field_j.length;
          stackIn_62_0 = var2_int;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_65_0 = var2;
          stackIn_65_1 = new StringBuilder().append("kg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final mg[] a(int param0) {
        hj[] var2;
        int var3;
        int var4;
        hj[] var5;
        int var3Lifetime1;
        hj[] var2Lifetime1;
        var4 = HoldTheLine.field_D;
        if (param0 == 16) {
          if (this.field_d != null) {
            return this.field_d;
          }
          var5 = le.a(this.field_f, -120);
          var2 = var5;
          if (var2 == null) {
            return this.field_d;
          }
          this.field_d = new mg[var5.length];
          for (var3 = 0; var5.length > var3; var3++) {
            this.field_d[var3] = new mg(var5[var3], this.field_b, this.field_c, this.field_e);
          }
          return this.field_d;
        }
        this.field_d = (mg[]) null;
        if (this.field_d != null) {
          return this.field_d;
        }
        var5 = le.a(this.field_f, -120);
        var2Lifetime1 = var5;
        if (var2Lifetime1 == null) {
          return this.field_d;
        }
        this.field_d = new mg[var5.length];
        for (var3Lifetime1 = 0; var5.length > var3Lifetime1; var3Lifetime1++) {
          this.field_d[var3Lifetime1] = new mg(var5[var3Lifetime1], this.field_b, this.field_c, this.field_e);
        }
        return this.field_d;
    }

    kg(String param0) {
        try {
          this.field_d = null;
          this.field_b = 4096;
          this.field_c = false;
          this.field_f = param0;
          this.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    kg(String param0, boolean param1, boolean param2) {
        try {
          this.field_f = param0;
          this.field_d = null;
          this.field_b = 4096;
          this.field_e = param2 ? true : false;
          this.field_c = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new e(9, 0, 4, 1);
    }
}
