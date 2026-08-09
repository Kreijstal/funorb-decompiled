/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    boolean field_d;
    private go field_j;
    private go[] field_a;
    private int field_h;
    private int[] field_b;
    private int field_e;
    private int field_f;
    static nj field_i;
    private int field_k;
    private int field_c;
    static int field_g;

    final void a(lg param0, int param1) {
        RuntimeException runtimeException = null;
        lg var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(jm.field_B, this.field_e);
              if (param1 == -875079928) {
                break L1;
              } else {
                var4 = (lg) null;
                this.a((lg) null, 64);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wg.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 <= -30) {
          if (this.field_j != null) {
            if (!this.field_j.field_a) {
              if (this.field_f >= this.field_j.field_j) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final bn a(boolean param0, boolean param1, boolean param2, bn param3) {
        bn var5 = null;
        RuntimeException var5_ref = null;
        bn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        boolean stackIn_2_2 = false;
        bn stackIn_3_0;
        boolean stackIn_3_1;
        boolean stackIn_3_2;
        int stackIn_3_3;
        bn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (bn) (param3);

              stackIn_2_1 = param0;

              stackIn_2_2 = param2;

              if (param1) {
                stackIn_3_0 = (bn) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 0;
                break L1;
              } else {
                stackIn_3_0 = (bn) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = 1;
                break L1;
              }
            }
            var5 = ((bn) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
            var5.a(jm.field_B, this.field_e, (ei) null, -1, 0, 0, param1);
            stackIn_4_0 = (bn) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("wg.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean c(int param0) {
        int dupTemp$0 = 0;
        int var2;
        this.field_d = false;
        if (this.field_a != null) {
          if (this.field_h >= 0) {
            dupTemp$0 = this.field_b[this.field_h];
            this.field_b[this.field_h] = dupTemp$0 - 1;
            if (dupTemp$0 < 0) {
              L0: {
                var2 = this.field_h;
                this.a(this.field_a[this.field_h], (byte) 82);
                this.field_h = var2;
                this.field_a[this.field_h] = null;
                this.field_h = this.field_h + 1;
                if (this.field_a.length == this.field_h) {
                  this.field_h = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (null != this.field_a[this.field_h]) {
                if (null != this.field_j) {
                  this.field_k = this.field_k - 1;
                  if (this.field_k > 0) {
                    if (param0 != -660903963) {
                      this.field_c = -76;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return this.a(false);
                  }
                } else {
                  return true;
                }
              } else {
                this.field_h = -1;
                if (null != this.field_j) {
                  this.field_k = this.field_k - 1;
                  if (this.field_k > 0) {
                    if (param0 != -660903963) {
                      this.field_c = -76;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return this.a(false);
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (null != this.field_j) {
                this.field_k = this.field_k - 1;
                if (this.field_k > 0) {
                  if (param0 == -660903963) {
                    return false;
                  } else {
                    this.field_c = -76;
                    return false;
                  }
                } else {
                  return this.a(false);
                }
              } else {
                return true;
              }
            }
          } else {
            if (null != this.field_j) {
              this.field_k = this.field_k - 1;
              if (this.field_k > 0) {
                if (param0 != -660903963) {
                  this.field_c = -76;
                  return false;
                } else {
                  return false;
                }
              } else {
                return this.a(false);
              }
            } else {
              return true;
            }
          }
        } else {
          if (null != this.field_j) {
            this.field_k = this.field_k - 1;
            if (this.field_k > 0) {
              if (param0 != -660903963) {
                this.field_c = -76;
                return false;
              } else {
                return false;
              }
            } else {
              return this.a(false);
            }
          } else {
            return true;
          }
        }
    }

    private final void b(int param0) {
        this.field_c = 0;
        this.field_e = 0;
        this.field_d = false;
        this.field_f = 0;
        this.field_k = param0;
    }

    final void a(go param0, byte param1) {
        if (param1 < 51) {
            return;
        }
        try {
            this.b(0);
            this.field_j = param0;
            this.field_e = this.field_j.field_c[this.field_c];
            this.field_k = this.field_j.field_e[this.field_c];
            this.field_h = -1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(boolean param0) {
        if (!param0) {
          this.field_d = true;
          this.field_c = this.field_c + 1;
          if (this.field_j.field_c.length <= this.field_c) {
            this.field_f = this.field_f + 1;
            if (this.field_j.field_a) {
              if (this.field_j.field_b >= 0) {
                if (this.field_j.field_c.length <= this.field_j.field_b) {
                  this.field_c = 0;
                  this.field_e = this.field_j.field_c[this.field_c];
                  this.field_k = this.field_j.field_e[this.field_c];
                  return false;
                } else {
                  this.field_c = this.field_j.field_b;
                  this.field_e = this.field_j.field_c[this.field_c];
                  this.field_k = this.field_j.field_e[this.field_c];
                  return false;
                }
              } else {
                this.field_c = 0;
                this.field_e = this.field_j.field_c[this.field_c];
                this.field_k = this.field_j.field_e[this.field_c];
                return false;
              }
            } else {
              if (this.field_f < this.field_j.field_j) {
                if (this.field_j.field_b >= 0) {
                  if (this.field_j.field_c.length <= this.field_j.field_b) {
                    this.field_c = 0;
                    this.field_e = this.field_j.field_c[this.field_c];
                    this.field_k = this.field_j.field_e[this.field_c];
                    return false;
                  } else {
                    this.field_c = this.field_j.field_b;
                    this.field_e = this.field_j.field_c[this.field_c];
                    this.field_k = this.field_j.field_e[this.field_c];
                    return false;
                  }
                } else {
                  this.field_c = 0;
                  this.field_e = this.field_j.field_c[this.field_c];
                  this.field_k = this.field_j.field_e[this.field_c];
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            this.field_e = this.field_j.field_c[this.field_c];
            this.field_k = this.field_j.field_e[this.field_c];
            return false;
          }
        } else {
          return false;
        }
    }

    final static int a(int param0, int param1) {
        if ((long)param1 >= 65536L) {
          if (16777216L <= (long)param1) {
            if (-268435457L < ((long)param1 ^ -1L)) {
              if ((long)param1 >= 67108864L) {
                return de.field_d[param1 >> 641346356] >> -1949603582;
              } else {
                return de.field_d[param1 >> -1639439214] >> 1577705795;
              }
            } else {
              if (((long)param1 ^ -1L) <= -1073741825L) {
                return de.field_d[param1 >> 1222062776];
              } else {
                return de.field_d[param1 >> -193508938] >> -713701535;
              }
            }
          } else {
            if ((long)param1 < 1048576L) {
              if (-262145L < ((long)param1 ^ -1L)) {
                return de.field_d[param1 >> 635386954] >> -1050195065;
              } else {
                return de.field_d[param1 >> -1375361460] >> -592626810;
              }
            } else {
              if (((long)param1 ^ -1L) > -4194305L) {
                return de.field_d[param1 >> -1225738514] >> -660903963;
              } else {
                return de.field_d[param1 >> -905431952] >> 2117522692;
              }
            }
          }
        } else {
          if (256L <= (long)param1) {
            if (-4097L < ((long)param1 ^ -1L)) {
              if (-1025L >= ((long)param1 ^ -1L)) {
                return de.field_d[param1 >> 1290170948] >> 2131467402;
              } else {
                return de.field_d[param1 >> 952050242] >> -1274004661;
              }
            } else {
              if ((long)param1 < 16384L) {
                return de.field_d[param1 >> -900429434] >> 1487892873;
              } else {
                return de.field_d[param1 >> 322535912] >> -875079928;
              }
            }
          } else {
            if ((param1 ^ -1) <= -1) {
              return de.field_d[param1] >> -1896209428;
            } else {
              if (param0 < 89) {
                wg.d(66);
                return -1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final void a(wg param0, byte param1) {
        try {
            this.field_f = param0.field_f;
            if (param1 <= 10) {
                this.field_h = -79;
            }
            this.field_e = param0.field_e;
            this.field_c = param0.field_c;
            this.field_d = param0.field_d;
            this.field_j = param0.field_j;
            this.field_k = param0.field_k;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "wg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var2 = (param1 * param1 >> -1547964756) * param1 >> 2019956620;
        if (param0 != 0) {
          return -28;
        } else {
          var3 = -61440 + 6 * param1;
          var4 = (var3 * param1 >> 103670252) + 40960;
          return var2 * var4 >> 327951020;
        }
    }

    public wg() {
        this.field_d = false;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -900429434) {
            wg.b(-112, -107);
        }
    }

    static {
        field_i = new nj();
    }
}
