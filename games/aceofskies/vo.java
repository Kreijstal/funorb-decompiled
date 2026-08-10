/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo extends li implements dr {
    static int[] field_d;
    private bm field_c;

    final static uc a(byte param0, int param1, int param2, int param3, int param4) {
        Object var5;
        uc var5_ref;
        int var6;
        var5 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= 120) {
          var5_ref = (uc) ((Object) nh.field_g.d(268435455));
          L0: while (true) {
            if (var5_ref != null) {
              if ((param4 ^ -1) != (var5_ref.field_n ^ -1)) {
                var5_ref = (uc) ((Object) nh.field_g.b((byte) 103));
                continue L0;
              } else {
                return var5_ref;
              }
            } else {
              var5_ref = new uc();
              var5_ref.field_n = param4;
              var5_ref.field_j = param2;
              var5_ref.field_m = param3;
              nh.field_g.a(81, var5_ref);
              ag.a(param1, 5, var5_ref);
              return var5_ref;
            }
          }
        } else {
          field_d = (int[]) null;
          var5_ref = (uc) ((Object) nh.field_g.d(268435455));
          L1: while (true) {
            if (var5_ref != null) {
              if ((param4 ^ -1) != (var5_ref.field_n ^ -1)) {
                var5_ref = (uc) ((Object) nh.field_g.b((byte) 103));
                continue L1;
              } else {
                return var5_ref;
              }
            } else {
              var5_ref = new uc();
              var5_ref.field_n = param4;
              var5_ref.field_j = param2;
              var5_ref.field_m = param3;
              nh.field_g.a(81, var5_ref);
              ag.a(param1, 5, var5_ref);
              return var5_ref;
            }
          }
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 26921) {
          if (null != this.field_c.field_f) {
            if (this.field_c.field_f.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_d = (int[]) null;
          if (null == this.field_c.field_f) {
            return true;
          } else {
            L0: {
              if (this.field_c.field_f.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void b(bm param0, int param1) {
        try {
            if (param1 != -40) {
                bm var4 = (bm) null;
                this.a((bm) null, -56);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vo.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(bm param0, int param1) {
        try {
            this.a((byte) 97);
            if (param1 != -6525) {
                bm var4 = (bm) null;
                this.b((bm) null, -98);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vo.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        String var3;
        if (param0 != 8192) {
          var3 = (String) null;
          this.a((String) null, (byte) -68);
          return this.a(this.field_c.field_f, (byte) 72);
        } else {
          return this.a(this.field_c.field_f, (byte) 72);
        }
    }

    abstract String a(String param0, byte param1);

    final pt c(int param0) {
        if (param0 != 0) {
          this.a(83);
          return this.a(this.field_c.field_f, param0 + 8192);
        } else {
          return this.a(this.field_c.field_f, param0 + 8192);
        }
    }

    abstract pt a(String param0, int param1);

    vo(bm param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void d(int param0) {
        if (param0 != 14695) {
            vo.d(89);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_d = new int[8192];
    }
}
