/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vg {
    private int field_h;
    private int field_k;
    private int field_l;
    private int field_f;
    private bs field_g;
    private int field_j;
    private int field_i;

    final boolean a(int param0, int param1) {
        if (!this.b(120)) {
          if (param1 != 3) {
            int discarded$4 = ((pi) this).b(-6, -25);
            return false;
          } else {
            return false;
          }
        } else {
          if (param0 <= ((pi) this).field_h) {
            if (param1 == 3) {
              return false;
            } else {
              int discarded$5 = ((pi) this).b(-6, -25);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (((pi) this).a(param2, 3)) {
          return true;
        } else {
          if (param1 == -1) {
            if ((((pi) this).field_k ^ -1) < -1) {
              if (param0 < ((pi) this).field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            boolean discarded$8 = ((pi) this).a(-125, -75, 17);
            if ((((pi) this).field_k ^ -1) < -1) {
              if (param0 < ((pi) this).field_l) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    private final int a(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((pi) this).c(40, 38);
            return ((pi) this).field_j;
        }
        return ((pi) this).field_j;
    }

    pi(bs param0, int param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4);
        ((pi) this).field_h = param5;
    }

    final boolean a(pi param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!((pi) this).field_g.a(false, param0.field_g)) {
          return false;
        } else {
          if (((pi) this).field_i != param0.field_i) {
            return false;
          } else {
            if (this.b(120)) {
              if (param0.field_h == ((pi) this).field_h) {
                if (((pi) this).field_k == param1) {
                  if (((pi) this).field_k == 0) {
                    ((pi) this).field_k = 0;
                    return true;
                  } else {
                    ((pi) this).field_f = param0.field_f;
                    ((pi) this).field_k = 0;
                    return true;
                  }
                } else {
                  if (param0.field_k != 0) {
                    L0: {
                      var3 = this.a(false);
                      var4 = param0.a(false);
                      var5 = this.c(-30481);
                      var6 = param0.c(param1 ^ -30481);
                      if (var4 > var5) {
                        break L0;
                      } else {
                        if (var6 < var3) {
                          break L0;
                        } else {
                          var7 = iia.d(var5, var6, 2);
                          var8 = et.b(var4, var3, param1 ^ -120);
                          if (((pi) this).field_k >= param0.field_k) {
                            ((pi) this).field_j = var8;
                            ((pi) this).field_k = var7 + -var8;
                            return true;
                          } else {
                            ((pi) this).field_f = param0.field_f;
                            ((pi) this).field_j = var8;
                            ((pi) this).field_k = var7 + -var8;
                            return true;
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    if (((pi) this).field_k == 0) {
                      ((pi) this).field_k = 0;
                      return true;
                    } else {
                      ((pi) this).field_f = param0.field_f;
                      ((pi) this).field_k = 0;
                      return true;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              if (((pi) this).field_k == param1) {
                if (((pi) this).field_k == 0) {
                  ((pi) this).field_k = 0;
                  return true;
                } else {
                  ((pi) this).field_f = param0.field_f;
                  ((pi) this).field_k = 0;
                  return true;
                }
              } else {
                if (param0.field_k != 0) {
                  var3 = this.a(false);
                  var4 = param0.a(false);
                  var5 = this.c(-30481);
                  var6 = param0.c(param1 ^ -30481);
                  if (var4 <= var5) {
                    if (var6 >= var3) {
                      var7 = iia.d(var5, var6, 2);
                      var8 = et.b(var4, var3, param1 ^ -120);
                      if (((pi) this).field_k >= param0.field_k) {
                        ((pi) this).field_j = var8;
                        ((pi) this).field_k = var7 + -var8;
                        return true;
                      } else {
                        ((pi) this).field_f = param0.field_f;
                        ((pi) this).field_j = var8;
                        ((pi) this).field_k = var7 + -var8;
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  if (((pi) this).field_k == 0) {
                    ((pi) this).field_k = 0;
                    return true;
                  } else {
                    ((pi) this).field_f = param0.field_f;
                    ((pi) this).field_k = 0;
                    return true;
                  }
                }
              }
            }
          }
        }
    }

    final boolean c(int param0, int param1) {
        if (param1 >= 95) {
          if (((pi) this).field_j <= param0) {
            if (0 != ((pi) this).field_k) {
              if (param0 < ((pi) this).field_l) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(dt param0, int param1) {
        if (param1 > -52) {
          int discarded$2 = this.c(22);
          ((pi) this).field_g.a(((pi) this).field_h, (byte) 102, param0);
          return;
        } else {
          ((pi) this).field_g.a(((pi) this).field_h, (byte) 102, param0);
          return;
        }
    }

    final void a(dt param0, int param1, int param2) {
        if (param2 != 0) {
          String discarded$2 = ((pi) this).toString();
          ((pi) this).field_g.a(param0, 113, ((pi) this).field_h, param1);
          return;
        } else {
          ((pi) this).field_g.a(param0, 113, ((pi) this).field_h, param1);
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 3) {
            return -84;
        }
        return ((pi) this).field_i;
    }

    private final void a(kh param0, int param1) {
        param0.h((byte) 112);
        if (param1 > -108) {
          L0: {
            boolean discarded$1 = ((pi) this).a(3, -70, 47);
            ((pi) this).field_g = lka.a(-90, param0, 26);
            ((pi) this).field_f = param0.b((byte) 44, 3);
            ((pi) this).field_i = param0.b((byte) 44, 3);
            ((pi) this).field_j = param0.b((byte) 44, 32);
            ((pi) this).field_k = param0.b((byte) 44, 8);
            ((pi) this).field_l = ((pi) this).field_j + 50 * ((pi) this).field_k;
            if (this.b(122)) {
              ((pi) this).field_h = param0.b((byte) 44, 5);
              break L0;
            } else {
              break L0;
            }
          }
          param0.i((byte) 98);
          return;
        } else {
          L1: {
            ((pi) this).field_g = lka.a(-90, param0, 26);
            ((pi) this).field_f = param0.b((byte) 44, 3);
            ((pi) this).field_i = param0.b((byte) 44, 3);
            ((pi) this).field_j = param0.b((byte) 44, 32);
            ((pi) this).field_k = param0.b((byte) 44, 8);
            ((pi) this).field_l = ((pi) this).field_j + 50 * ((pi) this).field_k;
            if (this.b(122)) {
              ((pi) this).field_h = param0.b((byte) 44, 5);
              break L1;
            } else {
              break L1;
            }
          }
          param0.i((byte) 98);
          return;
        }
    }

    private final boolean b(int param0) {
        if (param0 <= 118) {
            return true;
        }
        return ((pi) this).field_g.a(false);
    }

    final int b(int param0, int param1) {
        Object var4 = null;
        if (param1 > -15) {
          var4 = null;
          ((pi) this).a((dt) null, -69);
          return param0 + -((pi) this).field_j;
        } else {
          return param0 + -((pi) this).field_j;
        }
    }

    private final int c(int param0) {
        if (param0 != -30481) {
            return -32;
        }
        return ((pi) this).field_l;
    }

    public final String toString() {
        String var1 = "PendingEvent";
        var1 = var1 + "(instigator: " + ((pi) this).field_f + ", course:" + ((pi) this).field_i;
        if (!(!this.b(121))) {
            var1 = var1 + ", room:" + ((pi) this).field_h;
        }
        var1 = var1 + ", start:" + ((pi) this).field_j + ", duration:" + ((pi) this).field_k + ")";
        return var1;
    }

    private pi(bs param0, int param1, int param2, int param3, int param4) {
        ((pi) this).field_l = param4 * 50 + param3;
        ((pi) this).field_g = param0;
        ((pi) this).field_j = param3;
        ((pi) this).field_k = param4;
        ((pi) this).field_i = param2;
        ((pi) this).field_f = param1;
    }

    pi(kh param0) {
        this.a(param0, -124);
    }

    final void b(kh param0, int param1) {
        param0.i(8);
        if (param1 == -19733) {
          ((pi) this).field_g.a(param0, -5);
          param0.a((byte) -32, ((pi) this).field_f, 3);
          param0.a((byte) -2, ((pi) this).field_i, 3);
          param0.a((byte) -128, ((pi) this).field_j, 32);
          param0.a((byte) 95, ((pi) this).field_k, 8);
          if (this.b(122)) {
            param0.a((byte) -125, ((pi) this).field_h, 5);
            param0.k(-1826190686);
            return;
          } else {
            param0.k(-1826190686);
            return;
          }
        } else {
          boolean discarded$1 = ((pi) this).c(123, -124);
          ((pi) this).field_g.a(param0, -5);
          param0.a((byte) -32, ((pi) this).field_f, 3);
          param0.a((byte) -2, ((pi) this).field_i, 3);
          param0.a((byte) -128, ((pi) this).field_j, 32);
          param0.a((byte) 95, ((pi) this).field_k, 8);
          if (!this.b(122)) {
            param0.k(-1826190686);
            return;
          } else {
            param0.a((byte) -125, ((pi) this).field_h, 5);
            param0.k(-1826190686);
            return;
          }
        }
    }

    static {
    }
}
