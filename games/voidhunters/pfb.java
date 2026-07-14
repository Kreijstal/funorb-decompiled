/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfb {
    static String field_a;
    private int field_e;
    private vh field_b;
    private nga field_c;
    private int field_d;

    final void b(byte param0) {
        if (param0 <= 72) {
          field_a = null;
          ((pfb) this).field_b.a((byte) 61);
          ((pfb) this).field_c.b(0);
          ((pfb) this).field_d = ((pfb) this).field_e;
          return;
        } else {
          ((pfb) this).field_b.a((byte) 61);
          ((pfb) this).field_c.b(0);
          ((pfb) this).field_d = ((pfb) this).field_e;
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 77 / ((62 - param0) / 56);
    }

    private final void a(int param0, Object param1, long param2, int param3) {
        is var6 = null;
        ska var6_ref = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param3 > ((pfb) this).field_e) {
          throw new IllegalStateException();
        } else {
          this.a(-70, param2);
          ((pfb) this).field_d = ((pfb) this).field_d - param3;
          L0: while (true) {
            if (0 <= ((pfb) this).field_d) {
              if (param0 > -43) {
                return;
              } else {
                var6_ref = new ska(param1, param3);
                ((pfb) this).field_c.a((ksa) (Object) var6_ref, 0, param2);
                ((pfb) this).field_b.a(-17569, (fh) (Object) var6_ref);
                ((is) (Object) var6_ref).field_i = 0L;
                return;
              }
            } else {
              var6 = (is) (Object) ((pfb) this).field_b.a(-7481);
              this.a(var6, -17173);
              continue L0;
            }
          }
        }
    }

    pfb(int param0) {
        this(param0, param0);
    }

    final void a(Object param0, long param1, byte param2) {
        if (param2 != -117) {
          pfb.a(-73);
          this.a(param2 ^ 20, param0, param1, 1);
          return;
        } else {
          this.a(param2 ^ 20, param0, param1, 1);
          return;
        }
    }

    final Object a(byte param0) {
        is var2 = null;
        Object var3 = null;
        is var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = (is) (Object) ((pfb) this).field_c.a(param0 ^ 33);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == 67) {
              return null;
            } else {
              return null;
            }
          } else {
            var3 = var2.a(120);
            if (var3 == null) {
              var4 = var2;
              var2 = (is) (Object) ((pfb) this).field_c.a((byte) 44);
              var4.b(param0 ^ -3911);
              var4.d((byte) -35);
              ((pfb) this).field_d = ((pfb) this).field_d + var4.field_k;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        Object var3 = null;
        is var3_ref = null;
        bna var4 = null;
        int var5 = 0;
        var3 = null;
        var5 = VoidHunters.field_G;
        if (param0) {
          var3_ref = (is) (Object) ((pfb) this).field_b.a(false);
          L0: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              L1: {
                if (!var3_ref.e((byte) 74)) {
                  var3_ref.field_i = var3_ref.field_i + 1L;
                  if ((long)param1 < var3_ref.field_i + 1L) {
                    var4 = new bna(var3_ref.a(122), var3_ref.field_k);
                    ((pfb) this).field_c.a((ksa) (Object) var4, 0, var3_ref.field_b);
                    gbb.a((fh) (Object) var4, (fh) (Object) var3_ref, (byte) -68);
                    var3_ref.b(-3846);
                    var3_ref.d((byte) -35);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (null != var3_ref.a(107)) {
                    break L1;
                  } else {
                    var3_ref.b(-3846);
                    var3_ref.d((byte) -35);
                    ((pfb) this).field_d = ((pfb) this).field_d + var3_ref.field_k;
                    break L1;
                  }
                }
              }
              var3_ref = (is) (Object) ((pfb) this).field_b.b(8063);
              continue L0;
            }
          }
        } else {
          ((pfb) this).field_d = 105;
          var3_ref = (is) (Object) ((pfb) this).field_b.a(false);
          L2: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              L3: {
                if (!var3_ref.e((byte) 74)) {
                  var3_ref.field_i = var3_ref.field_i + 1L;
                  if ((long)param1 < var3_ref.field_i + 1L) {
                    var4 = new bna(var3_ref.a(122), var3_ref.field_k);
                    ((pfb) this).field_c.a((ksa) (Object) var4, 0, var3_ref.field_b);
                    gbb.a((fh) (Object) var4, (fh) (Object) var3_ref, (byte) -68);
                    var3_ref.b(-3846);
                    var3_ref.d((byte) -35);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != var3_ref.a(107)) {
                    break L3;
                  } else {
                    var3_ref.b(-3846);
                    var3_ref.d((byte) -35);
                    ((pfb) this).field_d = ((pfb) this).field_d + var3_ref.field_k;
                    break L3;
                  }
                }
              }
              var3_ref = (is) (Object) ((pfb) this).field_b.b(8063);
              continue L2;
            }
          }
        }
    }

    final Object a(boolean param0) {
        is var2 = null;
        Object var3 = null;
        int var5 = 0;
        is var6 = null;
        is var7 = null;
        var5 = VoidHunters.field_G;
        if (!param0) {
          var2 = (is) (Object) ((pfb) this).field_c.a((byte) 44);
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.a(118);
              if (var3 != null) {
                return var3;
              } else {
                var6 = var2;
                var2 = (is) (Object) ((pfb) this).field_c.a((byte) 44);
                var6.b(-3846);
                var6.d((byte) -35);
                ((pfb) this).field_d = ((pfb) this).field_d + var6.field_k;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          ((pfb) this).a((Object) null, -64L, (byte) -68);
          var2 = (is) (Object) ((pfb) this).field_c.a((byte) 44);
          L1: while (true) {
            if (var2 != null) {
              var3 = var2.a(118);
              if (var3 != null) {
                return var3;
              } else {
                var7 = var2;
                var2 = (is) (Object) ((pfb) this).field_c.a((byte) 44);
                var7.b(-3846);
                var7.d((byte) -35);
                ((pfb) this).field_d = ((pfb) this).field_d + var7.field_k;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final Object b(int param0, long param1) {
        Object var5 = null;
        ska var6 = null;
        is var7 = null;
        var7 = (is) (Object) ((pfb) this).field_c.a((byte) -124, param1);
        if (var7 != null) {
          var5 = var7.a(param0 ^ 94);
          if (var5 != null) {
            if (!var7.e((byte) 50)) {
              ((pfb) this).field_b.a(param0 + -17569, (fh) (Object) var7);
              var7.field_i = 0L;
              if (param0 == 0) {
                return var5;
              } else {
                pfb.a(-93);
                return var5;
              }
            } else {
              var6 = new ska(var5, var7.field_k);
              ((pfb) this).field_c.a((ksa) (Object) var6, 0, var7.field_b);
              ((pfb) this).field_b.a(-17569, (fh) (Object) var6);
              ((is) (Object) var6).field_i = 0L;
              var7.b(-3846);
              var7.d((byte) -35);
              if (param0 == 0) {
                return var5;
              } else {
                pfb.a(-93);
                return var5;
              }
            }
          } else {
            var7.b(-3846);
            var7.d((byte) -35);
            ((pfb) this).field_d = ((pfb) this).field_d + var7.field_k;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(is param0, int param1) {
        if (param1 != -17173) {
          return;
        } else {
          L0: {
            if (param0 != null) {
              param0.b(-3846);
              param0.d((byte) -35);
              ((pfb) this).field_d = ((pfb) this).field_d + param0.field_k;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final void a(int param0, long param1) {
        is var4 = null;
        if (param0 >= -66) {
          ((pfb) this).a((Object) null, 32L, (byte) 24);
          var4 = (is) (Object) ((pfb) this).field_c.a((byte) -112, param1);
          this.a(var4, -17173);
          return;
        } else {
          var4 = (is) (Object) ((pfb) this).field_c.a((byte) -112, param1);
          this.a(var4, -17173);
          return;
        }
    }

    private pfb(int param0, int param1) {
        int var3 = 0;
        ((pfb) this).field_b = new vh();
        ((pfb) this).field_d = param0;
        ((pfb) this).field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((pfb) this).field_c = new nga(var3);
            }
          } else {
            ((pfb) this).field_c = new nga(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Next mission: ";
    }
}
