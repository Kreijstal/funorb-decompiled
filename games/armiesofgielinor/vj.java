/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static int field_g;
    static int field_a;
    private int field_d;
    private qb[] field_l;
    private int[] field_k;
    private int field_h;
    static String field_n;
    boolean field_c;
    int field_i;
    static at field_b;
    int field_m;
    private int field_e;
    private qb field_f;
    static byte[][] field_j;

    public static void b(int param0) {
        field_n = null;
        field_b = null;
        field_j = (byte[][]) null;
        int var1 = 20 % ((param0 - -44) / 51);
    }

    final boolean a(int param0) {
        int dupTemp$0 = 0;
        int var2;
        this.field_c = false;
        if (null != this.field_l) {
          if (0 <= this.field_h) {
            dupTemp$0 = this.field_k[this.field_h];
            this.field_k[this.field_h] = dupTemp$0 - 1;
            if (0 > dupTemp$0) {
              var2 = this.field_h;
              this.a(-1, this.field_l[this.field_h]);
              this.field_h = var2;
              this.field_l[this.field_h] = null;
              this.field_h = this.field_h + 1;
              if (this.field_l.length != this.field_h) {
                if (this.field_l[this.field_h] == null) {
                  this.field_h = -1;
                  if (this.field_f == null) {
                    return true;
                  } else {
                    this.field_e = this.field_e - 1;
                    if (param0 < -72) {
                      if (this.field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    } else {
                      this.field_f = (qb) null;
                      if (this.field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  if (this.field_f == null) {
                    return true;
                  } else {
                    this.field_e = this.field_e - 1;
                    if (param0 < -72) {
                      if (this.field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    } else {
                      this.field_f = (qb) null;
                      if (this.field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                L0: {
                  this.field_h = 0;
                  if (this.field_l[this.field_h] == null) {
                    this.field_h = -1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (this.field_f == null) {
                  return true;
                } else {
                  this.field_e = this.field_e - 1;
                  if (param0 < -72) {
                    if (this.field_e <= 0) {
                      return this.a((byte) -33);
                    } else {
                      return false;
                    }
                  } else {
                    this.field_f = (qb) null;
                    if (this.field_e <= 0) {
                      return this.a((byte) -33);
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              if (this.field_f == null) {
                return true;
              } else {
                this.field_e = this.field_e - 1;
                if (param0 < -72) {
                  if (this.field_e <= 0) {
                    return this.a((byte) -33);
                  } else {
                    return false;
                  }
                } else {
                  this.field_f = (qb) null;
                  if (this.field_e <= 0) {
                    return this.a((byte) -33);
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            if (this.field_f == null) {
              return true;
            } else {
              this.field_e = this.field_e - 1;
              if (param0 < -72) {
                if (this.field_e <= 0) {
                  return this.a((byte) -33);
                } else {
                  return false;
                }
              } else {
                this.field_f = (qb) null;
                if (this.field_e <= 0) {
                  return this.a((byte) -33);
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          if (this.field_f == null) {
            return true;
          } else {
            this.field_e = this.field_e - 1;
            if (param0 < -72) {
              if (this.field_e <= 0) {
                return this.a((byte) -33);
              } else {
                return false;
              }
            } else {
              this.field_f = (qb) null;
              if (this.field_e > 0) {
                return false;
              } else {
                return this.a((byte) -33);
              }
            }
          }
        }
    }

    private final void a(boolean param0) {
        this.field_c = param0 ? true : false;
        this.field_m = 0;
        this.field_i = 0;
        this.field_d = 0;
        this.field_e = 0;
    }

    final kk a(boolean param0, boolean param1, boolean param2, kk param3) {
        kk var5 = null;
        RuntimeException var5_ref = null;
        kk stackIn_2_0 = null;
        kk stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        kk stackIn_6_0;
        boolean stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        kk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              L1: {
                stackIn_5_0 = (kk) (param3);

                stackIn_5_1 = param0;

                stackIn_5_2 = 0;

                if (param2) {
                  stackIn_6_0 = (kk) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = (kk) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = stackIn_5_2;
                  stackIn_6_3 = 1;
                  break L1;
                }
              }
              var5 = ((kk) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
              var5.a(ft.field_q, this.field_i, (wp) null, -1, 0, 0, param2);
              stackIn_7_0 = (kk) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final boolean a(byte param0) {
        this.field_m = this.field_m + 1;
        this.field_c = true;
        if (this.field_f.field_a.length <= this.field_m) {
          this.field_d = this.field_d + 1;
          if (!this.field_f.field_b) {
            if (this.field_f.field_j > this.field_d) {
              if (0 > this.field_f.field_g) {
                this.field_m = 0;
                this.field_i = this.field_f.field_a[this.field_m];
                this.field_e = this.field_f.field_d[this.field_m];
                if (param0 != -33) {
                  this.a(-91);
                  return false;
                } else {
                  return false;
                }
              } else {
                if (this.field_f.field_a.length <= this.field_f.field_g) {
                  this.field_m = 0;
                  this.field_i = this.field_f.field_a[this.field_m];
                  this.field_e = this.field_f.field_d[this.field_m];
                  if (param0 != -33) {
                    this.a(-91);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.field_m = this.field_f.field_g;
                  this.field_i = this.field_f.field_a[this.field_m];
                  this.field_e = this.field_f.field_d[this.field_m];
                  if (param0 != -33) {
                    this.a(-91);
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            if (0 > this.field_f.field_g) {
              this.field_m = 0;
              this.field_i = this.field_f.field_a[this.field_m];
              this.field_e = this.field_f.field_d[this.field_m];
              if (param0 != -33) {
                this.a(-91);
                return false;
              } else {
                return false;
              }
            } else {
              if (this.field_f.field_a.length <= this.field_f.field_g) {
                this.field_m = 0;
                this.field_i = this.field_f.field_a[this.field_m];
                this.field_e = this.field_f.field_d[this.field_m];
                if (param0 != -33) {
                  this.a(-91);
                  return false;
                } else {
                  return false;
                }
              } else {
                this.field_m = this.field_f.field_g;
                this.field_i = this.field_f.field_a[this.field_m];
                this.field_e = this.field_f.field_d[this.field_m];
                if (param0 != -33) {
                  this.a(-91);
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          this.field_i = this.field_f.field_a[this.field_m];
          this.field_e = this.field_f.field_d[this.field_m];
          if (param0 == -33) {
            return false;
          } else {
            this.a(-91);
            return false;
          }
        }
    }

    final void a(int param0, qb param1) {
        try {
            this.a(false);
            this.field_f = param1;
            this.field_i = this.field_f.field_a[this.field_m];
            this.field_e = this.field_f.field_d[this.field_m];
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public vj() {
        this.field_c = false;
    }

    vj(int param0) {
        this.field_c = false;
        this.field_h = -1;
        this.field_k = new int[param0];
        this.field_l = new qb[param0];
    }

    static {
        field_n = "Red_Team";
    }
}
