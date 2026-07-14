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
        int var1 = 20 % ((param0 - -44) / 51);
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
        ((vj) this).field_c = param0 ? true : false;
        ((vj) this).field_m = 0;
        ((vj) this).field_i = 0;
        ((vj) this).field_d = 0;
        ((vj) this).field_e = 0;
    }

    final kk a(boolean param0, boolean param1, boolean param2, kk param3) {
        kk var5 = null;
        kk stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        kk stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        kk stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        kk stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        kk stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        kk stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        if (!param1) {
          return null;
        } else {
          L0: {
            stackOut_1_0 = (kk) param3;
            stackOut_1_1 = param0;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (param2) {
              stackOut_3_0 = (kk) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L0;
            } else {
              stackOut_2_0 = (kk) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L0;
            }
          }
          var5 = ((kk) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, stackIn_4_3 != 0);
          var5.a(ft.field_q, ((vj) this).field_i, (wp) null, -1, 0, 0, param2);
          return var5;
        }
    }

    private final boolean a(byte param0) {
        ((vj) this).field_m = ((vj) this).field_m + 1;
        ((vj) this).field_c = true;
        if (((vj) this).field_f.field_a.length <= ((vj) this).field_m) {
          ((vj) this).field_d = ((vj) this).field_d + 1;
          if (!((vj) this).field_f.field_b) {
            if (((vj) this).field_f.field_j > ((vj) this).field_d) {
              if (0 > ((vj) this).field_f.field_g) {
                ((vj) this).field_m = 0;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                if (param0 != -33) {
                  boolean discarded$14 = ((vj) this).a(-91);
                  return false;
                } else {
                  return false;
                }
              } else {
                if (((vj) this).field_f.field_a.length <= ((vj) this).field_f.field_g) {
                  ((vj) this).field_m = 0;
                  ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                  ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                  if (param0 != -33) {
                    boolean discarded$15 = ((vj) this).a(-91);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((vj) this).field_m = ((vj) this).field_f.field_g;
                  ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                  ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                  if (param0 != -33) {
                    boolean discarded$16 = ((vj) this).a(-91);
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
            if (0 > ((vj) this).field_f.field_g) {
              ((vj) this).field_m = 0;
              ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
              ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
              if (param0 != -33) {
                boolean discarded$17 = ((vj) this).a(-91);
                return false;
              } else {
                return false;
              }
            } else {
              if (((vj) this).field_f.field_a.length <= ((vj) this).field_f.field_g) {
                ((vj) this).field_m = 0;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                if (param0 != -33) {
                  boolean discarded$18 = ((vj) this).a(-91);
                  return false;
                } else {
                  return false;
                }
              } else {
                ((vj) this).field_m = ((vj) this).field_f.field_g;
                ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
                ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
                if (param0 != -33) {
                  boolean discarded$19 = ((vj) this).a(-91);
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
          ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
          if (param0 == -33) {
            return false;
          } else {
            boolean discarded$20 = ((vj) this).a(-91);
            return false;
          }
        }
    }

    final void a(int param0, qb param1) {
        this.a(false);
        ((vj) this).field_f = param1;
        ((vj) this).field_i = ((vj) this).field_f.field_a[((vj) this).field_m];
        ((vj) this).field_e = ((vj) this).field_f.field_d[((vj) this).field_m];
        ((vj) this).field_h = param0;
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
