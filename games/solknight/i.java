/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends si {
    private nc field_L;
    static long field_H;
    static qh field_J;
    static int field_K;
    static String[] field_I;

    final void c(boolean param0) {
        ck var2 = null;
        kf var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        if (!param0) {
          var3 = (kf) ((Object) var2.a((byte) 94));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.h(1784)) {
                    break L1;
                  } else {
                    var3.c(10);
                    break L1;
                  }
                }
                var3 = (kf) ((Object) var2.c(122));
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_G = (rc) ((Object) this.d((byte) 115));
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_J = null;
        field_I = null;
        if (param0 == 30) {
            return;
        }
        i.a((byte) -67);
    }

    final rc h(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
            return (rc) null;
        }
        ck var2 = new ck(this.field_L);
        kf var3 = (kf) ((Object) var2.a((byte) 84));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.field_J)) {
                return var3.d((byte) -48);
            }
            var3 = (kf) ((Object) var2.c(param0 ^ 113));
        } while (var4 == 0);
        return null;
    }

    final void b(rc param0, int param1) {
        kf var4 = null;
        boolean discarded$0 = false;
        try {
            if (!(param0 instanceof kf)) {
                throw new IllegalArgumentException();
            }
            int var3_int = 63 % ((18 - param1) / 59);
            var4 = (kf) ((Object) param0);
            this.field_L.a(-3024, var4);
            var4.field_J = true;
            discarded$0 = var4.a(-1463, (rc) (this));
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        ck var2 = null;
        kf var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (kf) ((Object) var2.a((byte) 109));
        L0: while (true) {
          if (var3 == null) {
            if (param0 != 1) {
              field_I = (String[]) null;
              this.field_G = null;
              return;
            } else {
              this.field_G = null;
              return;
            }
          } else {
            var3.field_J = false;
            var3 = (kf) ((Object) var2.c(117));
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        rc discarded$2 = null;
        rc discarded$3 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        ck var9 = null;
        ck var10 = null;
        ck var11 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        if (null == this.field_w) {
          if (param3 == 0) {
            var10 = new ck(this.field_L);
            var6 = (rc) ((Object) var10.a(param3 ^ -25119));
            L0: while (true) {
              if (var6 != null) {
                var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                var6 = (rc) ((Object) var10.b(640));
                if (var7 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            discarded$2 = this.h(-93);
            var11 = new ck(this.field_L);
            var5 = var11;
            var6 = (rc) ((Object) var11.a(param3 ^ -25119));
            L1: while (true) {
              if (var6 != null) {
                var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                var6 = (rc) ((Object) var11.b(640));
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          this.field_w.a((byte) 125, param0, true, param2, (rc) (this));
          if (param3 == 0) {
            var8 = new ck(this.field_L);
            var5 = var8;
            var6 = (rc) ((Object) var8.a(param3 ^ -25119));
            L2: while (true) {
              if (var6 != null) {
                var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                var6 = (rc) ((Object) var8.b(640));
                if (var7 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            discarded$3 = this.h(-93);
            var9 = new ck(this.field_L);
            var5 = var9;
            var6 = (rc) ((Object) var9.a(param3 ^ -25119));
            L3: while (true) {
              if (var6 != null) {
                var6.a(param0 - -this.field_j, param1, this.field_m + param2, param3 ^ 0);
                var6 = (rc) ((Object) var9.b(640));
                if (var7 == 0) {
                  continue L3;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final kf d(byte param0) {
        ck var2 = null;
        kf var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (kf) ((Object) var2.a((byte) 92));
        if (param0 < 81) {
          field_I = (String[]) null;
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_J) {
                var3 = (kf) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var3 != null) {
              if (!var3.field_J) {
                var3 = (kf) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void d(boolean param0) {
        ck var2 = null;
        kf var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_8_0 = false;
        boolean stackOut_2_0 = false;
        boolean stackOut_7_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_L);
        var3 = (kf) ((Object) var2.a((byte) -66));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.e((byte) 124);
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      var3.c(10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (kf) ((Object) var2.c(119));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          if (stackIn_8_0) {
            return;
          } else {
            this.field_L = (nc) null;
            return;
          }
        }
    }

    public i() {
        super(0, 0, og.field_f, wc.field_e, (j) null, (dg) null);
        this.field_L = new nc();
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        } else {
          if (param1 % 10L != 0L) {
            lc.a(2767, param1);
            if (param0 >= 11) {
              return;
            } else {
              field_I = (String[]) null;
              return;
            }
          } else {
            lc.a(2767, param1 - 1L);
            lc.a(2767, 1L);
            if (!SolKnight.field_L) {
              if (param0 >= 11) {
                return;
              } else {
                field_I = (String[]) null;
                return;
              }
            } else {
              lc.a(2767, param1);
              if (param0 >= 11) {
                return;
              } else {
                field_I = (String[]) null;
                return;
              }
            }
          }
        }
    }

    static {
        field_J = new qh();
    }
}
