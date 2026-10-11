/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpb extends mc {
    static llb field_w;
    int field_v;

    qpb(shb param0) {
        super(param0.field_g, param0.field_r, param0.field_h, param0.field_f, (wwa) null, (sba) null);
        try {
          param0.a(0, this.field_h, this.field_f, 1, 0);
          this.field_t = param0;
          this.field_v = 256;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qpb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = 16777215;
        var4 = param1;
        if (var4 == 0) {
          var3 = 60159;
        } else {
          if (var4 == 1) {
            var3 = 13421619;
          } else {
            if (2 == var4) {
              var3 = 3394611;
            } else {
              if (3 == var4) {
                var3 = 14540253;
              } else {
                if (var4 == 4) {
                  var3 = 13894143;
                } else {
                  if (var4 == 5) {
                    var3 = 3460236;
                  } else {
                    if (var4 == 6) {
                      var3 = 3422668;
                    } else {
                      if (var4 == 7) {
                        var3 = 15372852;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (param2 != 13894143) {
          return -77;
        }
        if (param0) {
          var3 = (16711422 & var3 | 13421772) << 1;
        }
        return var3;
    }

    public qpb() {
        super(0, 0, 0, 0, (wwa) null, (sba) null);
        this.field_v = 256;
    }

    public static void b(boolean param0) {
        field_w = null;
        if (!param0) {
          field_w = (llb) null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        phb var7;
        phb var8;
        if (param1 != 0) {
          return;
        }
        if (null == this.field_t) {
          return;
        }
        if (param2 > 47) {
          if (this.field_v == 0) {
            return;
          }
          if (256 == this.field_v) {
            this.field_t.b(param0 + this.field_g, param1, 74, param3 + this.field_r);
            return;
          }
          var8 = new phb(this.field_t.field_h, this.field_t.field_f);
          de.a(117, var8);
          this.field_t.b(0, param1, 115, 0);
          bia.a((byte) 124);
          var8.d(param0 + this.field_g, this.field_r + param3, this.field_v);
          return;
        }
        qpb.a(false, 44, 54);
        if (this.field_v == 0) {
          return;
        }
        if (256 == this.field_v) {
          this.field_t.b(param0 + this.field_g, param1, 74, param3 + this.field_r);
          return;
        }
        var7 = new phb(this.field_t.field_h, this.field_t.field_f);
        de.a(117, var7);
        this.field_t.b(0, param1, 115, 0);
        bia.a((byte) 124);
        var7.d(param0 + this.field_g, this.field_r + param3, this.field_v);
        return;
    }

    static {
    }
}
