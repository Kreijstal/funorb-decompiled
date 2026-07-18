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
        field_j = null;
        int var1 = 0;
    }

    final boolean a(int param0) {
        int var2 = 0;
        ((vj) this).field_c = false;
        if (null != ((vj) this).field_l) {
          if (0 <= ((vj) this).field_h) {
            ((vj) this).field_k[((vj) this).field_h] = ((vj) this).field_k[((vj) this).field_h] - 1;
            if (0 > ((vj) this).field_k[((vj) this).field_h]) {
              var2 = ((vj) this).field_h;
              ((vj) this).a(-1, ((vj) this).field_l[((vj) this).field_h]);
              ((vj) this).field_h = var2;
              ((vj) this).field_l[((vj) this).field_h] = null;
              ((vj) this).field_h = ((vj) this).field_h + 1;
              if (((vj) this).field_l.length != ((vj) this).field_h) {
                if (((vj) this).field_l[((vj) this).field_h] == null) {
                  ((vj) this).field_h = -1;
                  if (((vj) this).field_f == null) {
                    return true;
                  } else {
                    ((vj) this).field_e = ((vj) this).field_e - 1;
                    if (param0 < -72) {
                      if (((vj) this).field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    } else {
                      ((vj) this).field_f = null;
                      if (((vj) this).field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  if (((vj) this).field_f == null) {
                    return true;
                  } else {
                    ((vj) this).field_e = ((vj) this).field_e - 1;
                    if (param0 < -72) {
                      if (((vj) this).field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    } else {
                      ((vj) this).field_f = null;
                      if (((vj) this).field_e <= 0) {
                        return this.a((byte) -33);
                      } else {
                        return false;
                      }
                    }
                  }
                }
              } else {
                L0: {
                  ((vj) this).field_h = 0;
                  if (((vj) this).field_l[((vj) this).field_h] == null) {
                    ((vj) this).field_h = -1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((vj) this).field_f == null) {
                  return true;
                } else {
                  ((vj) this).field_e = ((vj) this).field_e - 1;
                  if (param0 < -72) {
                    if (((vj) this).field_e <= 0) {
                      return this.a((byte) -33);
                    } else {
                      return false;
                    }
                  } else {
                    ((vj) this).field_f = null;
                    if (((vj) this).field_e <= 0) {
                      return this.a((byte) -33);
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              if (((vj) this).field_f == null) {
                return true;
              } else {
                ((vj) this).field_e = ((vj) this).field_e - 1;
                if (param0 < -72) {
                  if (((vj) this).field_e <= 0) {
                    return this.a((byte) -33);
                  } else {
                    return false;
                  }
                } else {
                  ((vj) this).field_f = null;
                  if (((vj) this).field_e <= 0) {
                    return this.a((byte) -33);
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            if (((vj) this).field_f == null) {
              return true;
            } else {
              ((vj) this).field_e = ((vj) this).field_e - 1;
              if (param0 < -72) {
                if (((vj) this).field_e <= 0) {
                  return this.a((byte) -33);
                } else {
                  return false;
                }
              } else {
                ((vj) this).field_f = null;
                if (((vj) this).field_e <= 0) {
                  return this.a((byte) -33);
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          if (((vj) this).field_f == null) {
            return true;
          } else {
            ((vj) this).field_e = ((vj) this).field_e - 1;
            if (param0 < -72) {
              if (((vj) this).field_e <= 0) {
                return this.a((byte) -33);
              } else {
                return false;
              }
            } else {
              ((vj) this).field_f = null;
              if (((vj) this).field_e > 0) {
                return false;
              } else {
                return this.a((byte) -33);
              }
            }
          }
        }
    }

    private final void a(boolean param0) {
        ((vj) this).field_c = false;
        ((vj) this).field_m = 0;
        ((vj) this).field_i = 0;
        ((vj) this).field_d = 0;
        ((vj) this).field_e = 0;
    }

    final kk a(boolean param0, boolean param1, boolean param2, kk param3) {
        kk var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        kk stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        kk stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        kk stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        kk stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kk stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        kk stackOut_5_0 = null;
        boolean stackOut_5_1 = false;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        kk stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        kk stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1) {
              L1: {
                stackOut_3_0 = (kk) param3;
                stackOut_3_1 = param0;
                stackOut_3_2 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (param2) {
                  stackOut_5_0 = (kk) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L1;
                } else {
                  stackOut_4_0 = (kk) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L1;
                }
              }
              var5 = ((kk) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
              var5.a(ft.field_q, ((vj) this).field_i, (wp) null, -1, 0, 0, param2);
              stackOut_6_0 = (kk) var5;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    private final boolean a(byte param0) {
        ((vj) this).field_m = ((vj) this).field_m + 1;
        ((vj) this).field_c = true;
        if (((vj) this).field_f.field_a.length <= ((vj) this).field_m) {
          ((vj) this).field_d = ((vj) this).field_d + 1;
          if (!((vj) this).field_f.field_b) {
            if (((vj) this).field_f.field_j > ((vj) this).field_d) {
              if (0 <= ((vj) this).field_f.field_g) {
                if (((vj) this).field_f.field_a.length > ((vj) this).field_f.field_g) {
                  ((vj) this).field_m = ((vj) this).field_f.field_g;
                  ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                  ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                  return false;
                } else {
                  ((vj) this).field_m = 0;
                  ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                  ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                  return false;
                }
              } else {
                ((vj) this).field_m = 0;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (0 <= ((vj) this).field_f.field_g) {
              if (((vj) this).field_f.field_a.length > ((vj) this).field_f.field_g) {
                ((vj) this).field_m = ((vj) this).field_f.field_g;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                return false;
              } else {
                ((vj) this).field_m = 0;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                return false;
              }
            } else {
              ((vj) this).field_m = 0;
              ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
              ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
              return false;
            }
          }
        } else {
          ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
          ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
          return false;
        }
    }

    final void a(int param0, qb param1) {
        try {
            this.a(false);
            ((vj) this).field_f = param1;
            ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
            ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
            ((vj) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public vj() {
        ((vj) this).field_c = false;
    }

    vj(int param0) {
        ((vj) this).field_c = false;
        ((vj) this).field_h = -1;
        ((vj) this).field_k = new int[param0];
        ((vj) this).field_l = new qb[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Red_Team";
    }
}
