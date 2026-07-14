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
        param0.a(jm.field_B, ((wg) this).field_e);
        if (param1 != -875079928) {
            Object var4 = null;
            ((wg) this).a((lg) null, 64);
        }
    }

    final boolean a(int param0) {
        if (param0 <= -30) {
          if (((wg) this).field_j != null) {
            if (!((wg) this).field_j.field_a) {
              if (((wg) this).field_f >= ((wg) this).field_j.field_j) {
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
        bn var5 = param3.a(param0, param2, !param1 ? true : false);
        var5.a(jm.field_B, ((wg) this).field_e, (ei) null, -1, 0, 0, param1);
        return var5;
    }

    final boolean c(int param0) {
        int var2 = 0;
        ((wg) this).field_d = false;
        if (((wg) this).field_a != null) {
          if (((wg) this).field_h >= 0) {
            ((wg) this).field_b[((wg) this).field_h] = ((wg) this).field_b[((wg) this).field_h] - 1;
            if (((wg) this).field_b[((wg) this).field_h] < 0) {
              L0: {
                var2 = ((wg) this).field_h;
                ((wg) this).a(((wg) this).field_a[((wg) this).field_h], (byte) 82);
                ((wg) this).field_h = var2;
                ((wg) this).field_a[((wg) this).field_h] = null;
                ((wg) this).field_h = ((wg) this).field_h + 1;
                if (((wg) this).field_a.length == ((wg) this).field_h) {
                  ((wg) this).field_h = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (null != ((wg) this).field_a[((wg) this).field_h]) {
                if (null != ((wg) this).field_j) {
                  ((wg) this).field_k = ((wg) this).field_k - 1;
                  if (((wg) this).field_k > 0) {
                    if (param0 != -660903963) {
                      ((wg) this).field_c = -76;
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
                ((wg) this).field_h = -1;
                if (null != ((wg) this).field_j) {
                  ((wg) this).field_k = ((wg) this).field_k - 1;
                  if (((wg) this).field_k > 0) {
                    if (param0 != -660903963) {
                      ((wg) this).field_c = -76;
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
              if (null != ((wg) this).field_j) {
                ((wg) this).field_k = ((wg) this).field_k - 1;
                if (((wg) this).field_k > 0) {
                  if (param0 == -660903963) {
                    return false;
                  } else {
                    ((wg) this).field_c = -76;
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
            if (null != ((wg) this).field_j) {
              ((wg) this).field_k = ((wg) this).field_k - 1;
              if (((wg) this).field_k > 0) {
                if (param0 != -660903963) {
                  ((wg) this).field_c = -76;
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
          if (null != ((wg) this).field_j) {
            ((wg) this).field_k = ((wg) this).field_k - 1;
            if (((wg) this).field_k > 0) {
              if (param0 != -660903963) {
                ((wg) this).field_c = -76;
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
        ((wg) this).field_c = 0;
        ((wg) this).field_e = 0;
        ((wg) this).field_d = false;
        ((wg) this).field_f = 0;
        ((wg) this).field_k = param0;
    }

    final void a(go param0, byte param1) {
        if (param1 < 51) {
          return;
        } else {
          this.b(0);
          ((wg) this).field_j = param0;
          ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
          ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
          ((wg) this).field_h = -1;
          return;
        }
    }

    private final boolean a(boolean param0) {
        if (!param0) {
          ((wg) this).field_d = true;
          ((wg) this).field_c = ((wg) this).field_c + 1;
          if (((wg) this).field_j.field_c.length <= ((wg) this).field_c) {
            ((wg) this).field_f = ((wg) this).field_f + 1;
            if (((wg) this).field_j.field_a) {
              if (((wg) this).field_j.field_b >= 0) {
                if (((wg) this).field_j.field_c.length <= ((wg) this).field_j.field_b) {
                  ((wg) this).field_c = 0;
                  ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                  ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                  return false;
                } else {
                  ((wg) this).field_c = ((wg) this).field_j.field_b;
                  ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                  ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                  return false;
                }
              } else {
                ((wg) this).field_c = 0;
                ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                return false;
              }
            } else {
              if (((wg) this).field_f < ((wg) this).field_j.field_j) {
                if (((wg) this).field_j.field_b >= 0) {
                  if (((wg) this).field_j.field_c.length <= ((wg) this).field_j.field_b) {
                    ((wg) this).field_c = 0;
                    ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                    ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                    return false;
                  } else {
                    ((wg) this).field_c = ((wg) this).field_j.field_b;
                    ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                    ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                    return false;
                  }
                } else {
                  ((wg) this).field_c = 0;
                  ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                  ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
            ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
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
        ((wg) this).field_f = param0.field_f;
        if (param1 <= 10) {
          ((wg) this).field_h = -79;
          ((wg) this).field_e = param0.field_e;
          ((wg) this).field_c = param0.field_c;
          ((wg) this).field_d = param0.field_d;
          ((wg) this).field_j = param0.field_j;
          ((wg) this).field_k = param0.field_k;
          return;
        } else {
          ((wg) this).field_e = param0.field_e;
          ((wg) this).field_c = param0.field_c;
          ((wg) this).field_d = param0.field_d;
          ((wg) this).field_j = param0.field_j;
          ((wg) this).field_k = param0.field_k;
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        ((wg) this).field_d = false;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -900429434) {
            int discarded$0 = wg.b(-112, -107);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new nj();
    }
}
