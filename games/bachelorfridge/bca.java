/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bca extends ii {
    boolean field_p;
    static al[][] field_n;
    eaa field_o;

    public static void c(int param0) {
        Object var2 = null;
        if (param0 != 15) {
          var2 = null;
          bca.a(-63, (vr) null, (vr) null);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    private final void a(aga param0, int param1) {
        if (!param0.a(((bca) this).field_k, 9)) {
          if (param0.a(119, 9)) {
            param0.d(119, (byte) -81);
            if (param1 != 119) {
              field_n = null;
              return;
            } else {
              return;
            }
          } else {
            param0.d(((bca) this).field_k, (byte) -85);
            if (param1 != 119) {
              field_n = null;
              return;
            } else {
              return;
            }
          }
        } else {
          param0.d(((bca) this).field_k, (byte) -85);
          if (param1 != 119) {
            field_n = null;
            return;
          } else {
            return;
          }
        }
    }

    bca(lu param0) {
        super(4, param0.e((byte) 76), param0);
    }

    final void a(op param0, boolean param1) {
        if (!(this instanceof ew)) {
          if (param1) {
            return;
          } else {
            this.a(((bca) this).field_l.a(109, param0), 119);
            ((bca) this).a(param0, -81);
            return;
          }
        } else {
          return;
        }
    }

    bca(int param0, nq param1) {
        super(4, param0, param1);
        ((bca) this).field_o = new eaa();
    }

    void a(op param0, int param1) {
        aga var3 = null;
        int var4 = 0;
        var4 = 26 % ((param1 - 12) / 35);
        var3 = ((bca) this).field_l.a(50, param0);
        if (((bca) this).field_k != 57) {
          if (((bca) this).field_k != 62) {
            if (((bca) this).field_k == 63) {
              param0.a(-25, var3, 14);
              return;
            } else {
              return;
            }
          } else {
            param0.a(-25, var3, 14);
            return;
          }
        } else {
          param0.a(-25, var3, 15);
          return;
        }
    }

    final static void a(int param0, vr param1, vr param2) {
        Object var4 = null;
        if (param0 > -101) {
          var4 = null;
          bca.a(51, (vr) null, (vr) null);
          la.field_s = param2;
          sha.field_l = param1;
          return;
        } else {
          la.field_s = param2;
          sha.field_l = param1;
          return;
        }
    }

    final void a(op param0, byte param1) {
        aga var3 = null;
        pp var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = BachelorFridge.field_y;
        if (param1 == -2) {
          var3 = ((bca) this).field_l.a(53, param0);
          if (((bca) this).field_p) {
            return;
          } else {
            var4 = (pp) (Object) ((bca) this).field_o.b((byte) 90);
            L0: while (true) {
              if (var4 == null) {
                this.a(var3, param1 + 121);
                return;
              } else {
                var4.a(var3, param0, 12);
                var4 = (pp) (Object) ((bca) this).field_o.c(0);
                continue L0;
              }
            }
          }
        } else {
          var6 = null;
          this.a((aga) null, -54);
          var3 = ((bca) this).field_l.a(53, param0);
          if (((bca) this).field_p) {
            return;
          } else {
            var4 = (pp) (Object) ((bca) this).field_o.b((byte) 90);
            L1: while (true) {
              if (var4 == null) {
                this.a(var3, param1 + 121);
                return;
              } else {
                var4.a(var3, param0, 12);
                var4 = (pp) (Object) ((bca) this).field_o.c(0);
                continue L1;
              }
            }
          }
        }
    }

    void a(byte param0, lu param1) {
        int var4 = 0;
        pp var5 = null;
        var4 = BachelorFridge.field_y;
        param1.b(((bca) this).field_k, -113);
        if (param0 <= -12) {
          param1.d(((bca) this).field_o.g(0), 0);
          var5 = (pp) (Object) ((bca) this).field_o.b((byte) 90);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param1, (byte) 92);
              var5 = (pp) (Object) ((bca) this).field_o.c(0);
              continue L0;
            }
          }
        } else {
          field_n = null;
          param1.d(((bca) this).field_o.g(0), 0);
          var5 = (pp) (Object) ((bca) this).field_o.b((byte) 90);
          L1: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param1, (byte) 92);
              var5 = (pp) (Object) ((bca) this).field_o.c(0);
              continue L1;
            }
          }
        }
    }

    static {
    }
}
