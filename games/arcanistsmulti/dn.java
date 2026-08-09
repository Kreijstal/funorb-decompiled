/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends kc {
    static String field_Bb;
    kc field_Hb;
    static String field_Gb;
    in field_Eb;
    kc field_Cb;
    static int field_Jb;
    static boolean field_Db;
    static String field_Fb;
    static boolean[] field_Ib;

    final static void a(wk param0, na param1, boolean param2, int param3) {
        na stackIn_5_0 = null;
        na stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        na stackIn_9_0 = null;
        na stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        na stackIn_12_0 = null;
        na stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        na stackIn_15_0 = null;
        na stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        na stackIn_18_0 = null;
        na stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        na stackIn_21_0 = null;
        na stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                param1.field_Rb = param0.e((byte) 49);
                break L1;
              }
            }
            L2: {
              param1.field_dc = param0.e((byte) 78);
              param1.field_Pb = param0.e((byte) -121);
              var4_int = param0.e((byte) 127);
              stackIn_5_0 = (na) (param1);

              if ((var4_int & 128) == 0) {
                stackIn_6_0 = (na) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (na) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                stackIn_6_0.field_mc = stackIn_6_1 != 0;
                stackIn_9_0 = (na) (param1);

                if (!param1.field_mc) {
                  break L4;
                } else {
                  stackIn_9_0 = (na) ((Object) stackIn_9_0);

                  if (param1.field_Rb >= param1.field_dc) {
                    break L4;
                  } else {
                    stackIn_10_0 = (na) ((Object) stackIn_9_0);
                    stackIn_10_1 = 1;
                    break L3;
                  }
                }
              }
              stackIn_10_0 = (na) ((Object) stackIn_9_0);
              stackIn_10_1 = 0;
              break L3;
            }
            L5: {
              stackIn_10_0.field_Ob = stackIn_10_1 != 0;
              stackIn_12_0 = (na) (param1);

              if (-1 == (var4_int & 8 ^ -1)) {
                stackIn_13_0 = (na) ((Object) stackIn_12_0);
                stackIn_13_1 = 0;
                break L5;
              } else {
                stackIn_13_0 = (na) ((Object) stackIn_12_0);
                stackIn_13_1 = 1;
                break L5;
              }
            }
            L6: {
              stackIn_13_0.field_kc = stackIn_13_1 != 0;
              stackIn_15_0 = (na) (param1);

              if ((64 & var4_int) == 0) {
                stackIn_16_0 = (na) ((Object) stackIn_15_0);
                stackIn_16_1 = 0;
                break L6;
              } else {
                stackIn_16_0 = (na) ((Object) stackIn_15_0);
                stackIn_16_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_16_0.field_Lb = stackIn_16_1 != 0;
              stackIn_18_0 = (na) (param1);

              if (0 == (var4_int & 32)) {
                stackIn_19_0 = (na) ((Object) stackIn_18_0);
                stackIn_19_1 = 0;
                break L7;
              } else {
                stackIn_19_0 = (na) ((Object) stackIn_18_0);
                stackIn_19_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_oc = stackIn_19_1 != 0;
              stackIn_21_0 = (na) (param1);

              if (-1 != (var4_int & 16 ^ -1)) {
                stackIn_22_0 = (na) ((Object) stackIn_21_0);
                stackIn_22_1 = 2;
                break L8;
              } else {
                stackIn_22_0 = (na) ((Object) stackIn_21_0);
                stackIn_22_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_Fb = stackIn_22_1;
              if (-1 == (4 & var4_int ^ -1)) {
                stackIn_25_0 = 0;
                break L9;
              } else {
                stackIn_25_0 = 1;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_25_0;
              param0.a((byte) 122, 0, param1.field_Wb, param1.field_Wb.length);
              if ((var4_int & param3) == 0) {
                stackIn_28_0 = 0;
                break L10;
              } else {
                stackIn_28_0 = 1;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_28_0;
              param1.field_Db = param0.n(param3 ^ -100);
              param1.field_Yb = qj.b(param3 + -26574) + -(long)param0.d(-10674);
              if (var5 == 0) {
                param1.field_nc = -1;
                break L11;
              } else {
                param1.field_nc = param0.d(-10674);
                break L11;
              }
            }
            L12: {
              param1.field_Bb = param0.c(-943038560);
              var7 = param0.field_g;
              param1.field_ic = param0.l(-1);
              if (var6 == 0) {
                param1.field_Qb = null;
                break L12;
              } else {
                param1.field_Qb = new String[param1.field_Rb];
                param0.field_g = var7;
                var8 = 0;
                L13: while (true) {
                  if (param1.field_Rb <= var8) {
                    break L12;
                  } else {
                    param1.field_Qb[var8] = param0.l(-1);
                    var8++;
                    continue L13;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4);

            stackIn_39_1 = new StringBuilder().append("dn.J(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L14;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L15;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L15;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2, byte param3, int param4) {
        na var7;
        L0: {
          if (this.field_Eb.f((byte) 59)) {
            this.field_Cb.field_bb = this.field_Cb.field_bb + param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!this.field_Eb.e(true)) {
            break L1;
          } else {
            this.field_Cb.field_bb = this.field_Cb.field_bb - param0;
            break L1;
          }
        }
        L2: {
          if (!this.field_Eb.e(40)) {
            break L2;
          } else {
            this.field_Cb.field_bb = this.field_Cb.field_bb + param1;
            break L2;
          }
        }
        L3: {
          if (!this.field_Eb.f(true)) {
            break L3;
          } else {
            this.field_Cb.field_bb = this.field_Cb.field_bb - param1;
            break L3;
          }
        }
        if (!this.field_C) {
          L4: {
            if (!param2) {
              if (-this.field_Hb.field_I + (this.field_Cb.field_I + this.field_Cb.field_B) >= -(this.field_Cb.field_db + this.field_Cb.field_bb)) {
                if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                  this.field_Cb.field_bb = -this.field_Cb.field_db;
                  break L4;
                } else {
                  if (!this.field_Eb.f(123)) {
                    this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                    if (param3 != 63) {
                      var7 = (na) null;
                      dn.a((wk) null, (na) null, false, -49);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                    this.field_Cb.field_bb = 0;
                    this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                    if (param3 != 63) {
                      var7 = (na) null;
                      dn.a((wk) null, (na) null, false, -49);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L5: {
                  this.field_Cb.field_bb = -(-this.field_Hb.field_I + (this.field_Cb.field_B + this.field_Cb.field_I)) + -this.field_Cb.field_db;
                  if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                    this.field_Cb.field_bb = -this.field_Cb.field_db;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (!this.field_Eb.f(123)) {
                  this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                  if (param3 != 63) {
                    var7 = (na) null;
                    dn.a((wk) null, (na) null, false, -49);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                    this.field_Cb.field_bb = 0;
                    this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                    if (param3 == 63) {
                      break L6;
                    } else {
                      var7 = (na) null;
                      dn.a((wk) null, (na) null, false, -49);
                      break L6;
                    }
                  }
                  return;
                }
              }
            } else {
              L7: {
                if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                  this.field_Cb.field_bb = -this.field_Cb.field_db;
                  break L7;
                } else {
                  break L7;
                }
              }
              if (-(this.field_Cb.field_bb + this.field_Cb.field_db) <= this.field_Cb.field_I + (this.field_Cb.field_B - this.field_Hb.field_I)) {
                break L4;
              } else {
                L8: {
                  this.field_Cb.field_bb = -this.field_Cb.field_db + -(this.field_Cb.field_I - (-this.field_Cb.field_B + this.field_Hb.field_I));
                  if (!this.field_Eb.f(123)) {
                    break L8;
                  } else {
                    this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                    this.field_Cb.field_bb = 0;
                    break L8;
                  }
                }
                this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                if (param3 != 63) {
                  var7 = (na) null;
                  dn.a((wk) null, (na) null, false, -49);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (!this.field_Eb.f(123)) {
            this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
            if (param3 != 63) {
              var7 = (na) null;
              dn.a((wk) null, (na) null, false, -49);
              return;
            } else {
              return;
            }
          } else {
            this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
            this.field_Cb.field_bb = 0;
            this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
            if (param3 != 63) {
              var7 = (na) null;
              dn.a((wk) null, (na) null, false, -49);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_Cb.field_bb = this.field_Cb.field_bb - param4;
          if (!param2) {
            if (-this.field_Hb.field_I + (this.field_Cb.field_I + this.field_Cb.field_B) >= -(this.field_Cb.field_db + this.field_Cb.field_bb)) {
              L9: {
                if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                  this.field_Cb.field_bb = -this.field_Cb.field_db;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (!this.field_Eb.f(123)) {
                  break L10;
                } else {
                  this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                  this.field_Cb.field_bb = 0;
                  break L10;
                }
              }
              L11: {
                this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                if (param3 == 63) {
                  break L11;
                } else {
                  var7 = (na) null;
                  dn.a((wk) null, (na) null, false, -49);
                  break L11;
                }
              }
              return;
            } else {
              L12: {
                this.field_Cb.field_bb = -(-this.field_Hb.field_I + (this.field_Cb.field_B + this.field_Cb.field_I)) + -this.field_Cb.field_db;
                if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                  this.field_Cb.field_bb = -this.field_Cb.field_db;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (!this.field_Eb.f(123)) {
                  break L13;
                } else {
                  this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                  this.field_Cb.field_bb = 0;
                  break L13;
                }
              }
              L14: {
                this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                if (param3 == 63) {
                  break L14;
                } else {
                  var7 = (na) null;
                  dn.a((wk) null, (na) null, false, -49);
                  break L14;
                }
              }
              return;
            }
          } else {
            L15: {
              if (-1 < (-(this.field_Cb.field_bb + this.field_Cb.field_db) ^ -1)) {
                this.field_Cb.field_bb = -this.field_Cb.field_db;
                break L15;
              } else {
                break L15;
              }
            }
            if (-(this.field_Cb.field_bb + this.field_Cb.field_db) > this.field_Cb.field_I + (this.field_Cb.field_B - this.field_Hb.field_I)) {
              this.field_Cb.field_bb = -this.field_Cb.field_db + -(this.field_Cb.field_I - (-this.field_Cb.field_B + this.field_Hb.field_I));
              L16: {
                if (!this.field_Eb.f(123)) {
                  break L16;
                } else {
                  this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                  this.field_Cb.field_bb = 0;
                  break L16;
                }
              }
              L17: {
                this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                if (param3 == 63) {
                  break L17;
                } else {
                  var7 = (na) null;
                  dn.a((wk) null, (na) null, false, -49);
                  break L17;
                }
              }
              return;
            } else {
              L18: {
                if (!this.field_Eb.f(123)) {
                  break L18;
                } else {
                  this.field_Cb.field_db = -this.field_Eb.a(this.field_Hb.field_I, this.field_Cb.field_I, param2, (byte) -55);
                  this.field_Cb.field_bb = 0;
                  break L18;
                }
              }
              L19: {
                this.field_Eb.a(109, this.field_Hb.field_I, -this.field_Cb.field_db, this.field_Cb.field_I);
                if (param3 == 63) {
                  break L19;
                } else {
                  var7 = (na) null;
                  dn.a((wk) null, (na) null, false, -49);
                  break L19;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param2 != 9860) {
          field_Fb = (String) null;
          this.a(param0, this.field_Hb.field_I, param3, (byte) 63, param1);
          return;
        } else {
          this.a(param0, this.field_Hb.field_I, param3, (byte) 63, param1);
          return;
        }
    }

    final boolean a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5) {
        bd var8;
        if (param1 != 98) {
          var8 = (bd) null;
          dn.a(true, (bd) null, (byte) -112, false, 112);
          return this.a(this.field_Hb.field_I, param0, param3, param4, -5368, param5, param2);
        } else {
          return this.a(this.field_Hb.field_I, param0, param3, param4, -5368, param5, param2);
        }
    }

    public static void e(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Ib = null;
        field_Bb = null;
        if (param0 != 1) {
            field_Bb = (String) null;
        }
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8;
        if (param1) {
          var8 = 1;
          this.field_Cb.a(true, param2, var8 != 0, this.field_Hb.field_I);
          this.a(param6, param0, false, (byte) 63, param3);
          if (param4 != -5368) {
            this.field_Cb = (kc) null;
            return var8 != 0;
          } else {
            return var8 != 0;
          }
        } else {
          if (this.field_C) {
            if (!param5) {
              var8 = 1;
              this.field_Cb.a(true, param2, var8 != 0, this.field_Hb.field_I);
              this.a(param6, param0, false, (byte) 63, param3);
              if (param4 != -5368) {
                this.field_Cb = (kc) null;
                return var8 != 0;
              } else {
                return var8 != 0;
              }
            } else {
              var8 = 0;
              this.field_Cb.a(true, param2, var8 != 0, this.field_Hb.field_I);
              this.a(param6, param0, false, (byte) 63, param3);
              if (param4 != -5368) {
                this.field_Cb = (kc) null;
                return var8 != 0;
              } else {
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            this.field_Cb.a(true, param2, var8 != 0, this.field_Hb.field_I);
            this.a(param6, param0, false, (byte) 63, param3);
            if (param4 != -5368) {
              this.field_Cb = (kc) null;
              return var8 != 0;
            } else {
              return var8 != 0;
            }
          }
        }
    }

    dn(long param0, kc param1, kc param2, in param3) {
        super(param0, (kc) null);
        try {
            this.field_Hb = new kc(0L, param2);
            this.field_Eb = new in(0L, param3);
            this.a(this.field_Hb, 49);
            this.a(this.field_Eb, 79);
            this.field_Cb = param1;
            this.field_Hb.a(param1, 62);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        this.field_I = param5;
        if (param3) {
          return;
        } else {
          this.field_T = param4;
          this.field_db = param0;
          this.field_x = param2;
          this.a(param1, param6, (byte) 106);
          return;
        }
    }

    final static void a(boolean param0, bd param1, byte param2, boolean param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              hj.field_a[0] = ag.field_D.nextInt();
              hj.field_a[1] = ag.field_D.nextInt();
              hj.field_a[2] = (int)(of.field_j >> 866304672);
              hj.field_a[3] = (int)of.field_j;
              jf.field_a.field_g = 0;
              jf.field_a.a(hj.field_a[0], (byte) -101);
              jf.field_a.a(hj.field_a[1], (byte) -101);
              jf.field_a.a(hj.field_a[2], (byte) -101);
              jf.field_a.a(hj.field_a[3], (byte) -101);
              i.a(jf.field_a, 24);
              jf.field_a.c(param4, (byte) -62);
              param1.a(jf.field_a, param2 + -55);
              he.field_e.field_g = 0;
              if (!param0) {
                he.field_e.f(16, (byte) -8);
                break L1;
              } else {
                he.field_e.f(18, (byte) -4);
                break L1;
              }
            }
            L2: {
              he.field_e.field_g = he.field_e.field_g + 2;
              var5_int = he.field_e.field_g;
              he.field_e.a(gm.field_d, (byte) -101);
              he.field_e.a(ho.field_c, (byte) 36);
              var6 = 0;
              if (!lk.field_d) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (!fl.field_a) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (!param3) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (null != rj.field_i) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              he.field_e.f(var6, (byte) -54);
              var7 = gb.a(cd.e(param2 ^ 3), -120);
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              he.field_e.a(var7, param2 ^ 23377);
              if (rj.field_i == null) {
                break L7;
              } else {
                he.field_e.a(rj.field_i, (byte) -110);
                break L7;
              }
            }
            L8: {
              vd.a(false, he.field_e, nl.field_Jb, jf.field_a, q.field_K);
              if (param2 == 116) {
                break L8;
              } else {
                dn.e(-40);
                break L8;
              }
            }
            he.field_e.a(he.field_e.field_g + -var5_int, -19571);
            we.a(-1, (byte) 104);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("dn.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
          field_Ib = (boolean[]) null;
          this.field_Cb.field_T = 0;
          this.field_Hb.field_I = this.field_I;
          this.field_Hb.field_x = this.field_x + (-param0 - param1);
          this.field_Cb.field_x = -param1 + -param0 + this.field_x;
          this.field_Eb.a(0, false, this.field_I, this.field_Cb.field_I, -this.field_Cb.field_db, param0, this.field_Hb.field_I, this.field_x - param0);
          return;
        } else {
          this.field_Cb.field_T = 0;
          this.field_Hb.field_I = this.field_I;
          this.field_Hb.field_x = this.field_x + (-param0 - param1);
          this.field_Cb.field_x = -param1 + -param0 + this.field_x;
          this.field_Eb.a(0, false, this.field_I, this.field_Cb.field_I, -this.field_Cb.field_db, param0, this.field_Hb.field_I, this.field_x - param0);
          return;
        }
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, boolean param5) {
        ab var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            if (param0 != -13214) {
                field_Db = false;
            }
            var6 = he.field_e;
            var6.b((byte) -44, param3);
            var6.field_g = var6.field_g + 1;
            var7 = var6.field_g;
            var6.f(4, (byte) -77);
            var6.f(param4, (byte) -56);
            var8 = param1;
            if (!(!param5)) {
                var8 += 128;
            }
            var6.f(var8, (byte) -32);
            var6.a(param2, 0, (byte) -86, param2.length);
            var6.b(var6.field_g + -var7, (byte) 43);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dn.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static kc f(byte param0) {
        if (param0 >= -45) {
            dn.f((byte) 61);
            return na.f((byte) 111);
        }
        return na.f((byte) 111);
    }

    static {
        field_Bb = "The dank caves of the goblins are a common battleground. Intensive mining has disturbed the deep and the ground is liable to erupt from under your feet!";
        field_Gb = "Confirm Email:";
        field_Fb = "Type your email address again to make sure it's correct";
    }
}
