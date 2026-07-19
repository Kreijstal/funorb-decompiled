/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private int field_c;
    private tc field_e;
    private int field_d;
    private tc field_f;
    private tc[] field_a;
    static String field_b;

    final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        tc var4 = null;
        tc var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_c) {
            if (param0 >= 109) {
              return var2;
            } else {
              return 109;
            }
          } else {
            var4 = this.field_a[var3];
            if (var6 == 0) {
              var5 = var4.field_b;
              L1: while (true) {
                L2: {
                  if (var4 == var5) {
                    var3++;
                    break L2;
                  } else {
                    var2++;
                    var5 = var5.field_b;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                continue L0;
              }
            } else {
              return var2;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        fm.field_d[4] = param1;
        if (param0 == -1) {
            return;
        }
        bg.a(87, 95);
    }

    final tc b(int param0) {
        if (param0 != 1) {
          this.c((byte) -43);
          this.field_d = 0;
          return this.b((byte) 85);
        } else {
          this.field_d = 0;
          return this.b((byte) 85);
        }
    }

    final tc a(int param0, long param1) {
        tc var4 = null;
        tc var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = this.field_a[(int)((long)(this.field_c + -1) & param1)];
        this.field_e = var4.field_b;
        if (param0 > -8) {
          bg.a(-7);
          L0: while (true) {
            if (var4 != this.field_e) {
              if (var6 == 0) {
                if ((param1 ^ -1L) == (this.field_e.field_i ^ -1L)) {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_b;
                  return var5;
                } else {
                  this.field_e = this.field_e.field_b;
                  continue L0;
                }
              } else {
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var4 != this.field_e) {
              if (var6 == 0) {
                if ((param1 ^ -1L) == (this.field_e.field_i ^ -1L)) {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_b;
                  return var5;
                } else {
                  this.field_e = this.field_e.field_b;
                  continue L1;
                }
              } else {
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        tc var3_ref_tc = null;
        int var3 = 0;
        tc var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_c) {
            var3 = -28 / ((param0 - -43) / 39);
            this.field_f = null;
            this.field_e = null;
            return;
          } else {
            var3_ref_tc = this.field_a[var2];
            L1: while (true) {
              L2: {
                L3: {
                  var4 = var3_ref_tc.field_b;
                  if (var3_ref_tc == var4) {
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        break L2;
                      } else {
                        var4.d(-111);
                        break L3;
                      }
                    }
                  } else {
                    var4.d(-111);
                    break L3;
                  }
                }
                if (var5 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
              var2++;
              continue L0;
            }
          }
        }
    }

    bg(int param0) {
        tc dupTemp$2 = null;
        int var2 = 0;
        tc var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_d = 0;
        this.field_a = new tc[param0];
        this.field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new tc();
            var3 = dupTemp$2;
            this.field_a[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_j = var3;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final tc b(byte param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int discarded$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int var3 = 0;
        tc var4 = null;
        tc var5 = null;
        tc var36 = null;
        tc var37 = null;
        tc var38 = null;
        tc var39 = null;
        tc var42 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 > 45) {
          if (0 < this.field_d) {
            if (this.field_f == this.field_a[this.field_d - 1]) {
              L0: while (true) {
                if (this.field_c > this.field_d) {
                  fieldTemp$5 = this.field_d;
                  this.field_d = this.field_d + 1;
                  var4 = this.field_a[fieldTemp$5].field_b;
                  var39 = var4;
                  if (var4 == this.field_a[this.field_d - 1]) {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      return null;
                    }
                  } else {
                    this.field_f = var39.field_b;
                    return var39;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var42 = this.field_f;
              this.field_f = var42.field_b;
              return var42;
            }
          } else {
            L1: while (true) {
              if (this.field_c > this.field_d) {
                fieldTemp$6 = this.field_d;
                this.field_d = this.field_d + 1;
                var4 = this.field_a[fieldTemp$6].field_b;
                var38 = var4;
                if (var4 == this.field_a[this.field_d - 1]) {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  this.field_f = var38.field_b;
                  return var38;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          discarded$7 = this.a((byte) 90);
          if (0 < this.field_d) {
            if (this.field_f != this.field_a[this.field_d - 1]) {
              var36 = this.field_f;
              this.field_f = var36.field_b;
              return var36;
            } else {
              L2: while (true) {
                if (this.field_c > this.field_d) {
                  fieldTemp$8 = this.field_d;
                  this.field_d = this.field_d + 1;
                  var4 = this.field_a[fieldTemp$8].field_b;
                  var37 = var4;
                  if (var4 == this.field_a[this.field_d - 1]) {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      return null;
                    }
                  } else {
                    this.field_f = var37.field_b;
                    return var37;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (this.field_c > this.field_d) {
                fieldTemp$9 = this.field_d;
                this.field_d = this.field_d + 1;
                var4 = this.field_a[fieldTemp$9].field_b;
                var5 = var4;
                if (var4 == this.field_a[this.field_d - 1]) {
                  if (var3 == 0) {
                    continue L3;
                  } else {
                    return null;
                  }
                } else {
                  this.field_f = var5.field_b;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -2) {
            bg.a(-78);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final void a(tc param0, long param1, int param2) {
        tc var5 = null;
        try {
            if (!(null == param0.field_j)) {
                param0.d(-128);
            }
            if (param2 < 14) {
                this.field_e = (tc) null;
            }
            var5 = this.field_a[(int)((long)(-1 + this.field_c) & param1)];
            param0.field_b = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_b = param0;
            param0.field_i = param1;
            param0.field_b.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Start Game";
    }
}
