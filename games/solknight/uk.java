/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends a {
    private vg field_j;
    private vg field_l;
    static o field_k;

    final String a(String param0, boolean param1) {
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        String var7 = null;
        var7 = ((uk) this).field_j.field_i.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (b.a(var5, (byte) 117)) {
            return ub.field_a;
          } else {
            if (!lc.a(0, var5)) {
              if (!param1) {
                if (lh.a(var5, (byte) -112)) {
                  return uh.field_P;
                } else {
                  if (!this.a((byte) 85, param0)) {
                    if (-1 > (var7.length() ^ -1)) {
                      if (ne.a(var5, false, var7)) {
                        return la.field_m;
                      } else {
                        if (gl.a(var5, 124, var7)) {
                          return wf.field_a;
                        } else {
                          if (l.a(var7, var5, 0)) {
                            return la.field_m;
                          } else {
                            return ub.field_a;
                          }
                        }
                      }
                    } else {
                      return ik.field_a;
                    }
                  } else {
                    return ji.field_c;
                  }
                }
              } else {
                var6 = null;
                String discarded$1 = ((uk) this).a((String) null, false);
                if (lh.a(var5, (byte) -112)) {
                  return uh.field_P;
                } else {
                  if (!this.a((byte) 85, param0)) {
                    if (-1 > (var7.length() ^ -1)) {
                      if (ne.a(var5, false, var7)) {
                        return la.field_m;
                      } else {
                        if (gl.a(var5, 124, var7)) {
                          return wf.field_a;
                        } else {
                          if (l.a(var7, var5, 0)) {
                            return la.field_m;
                          } else {
                            return ub.field_a;
                          }
                        }
                      }
                    } else {
                      return ik.field_a;
                    }
                  } else {
                    return ji.field_c;
                  }
                }
              }
            } else {
              return kb.field_e;
            }
          }
        } else {
          return null;
        }
    }

    final qf a(String param0, byte param1) {
        String var3 = null;
        String var4 = null;
        var3 = ((uk) this).field_j.field_i.toLowerCase();
        var4 = param0.toLowerCase();
        if (var4.length() == 0) {
          return rg.field_f;
        } else {
          if (bg.a(var3, 74, var4)) {
            if (param1 < -109) {
              if (this.a((byte) 82, param0)) {
                return rg.field_f;
              } else {
                return ph.field_g;
              }
            } else {
              int discarded$2 = uk.a((byte) -12, 94);
              if (this.a((byte) 82, param0)) {
                return rg.field_f;
              } else {
                return ph.field_g;
              }
            }
          } else {
            return rg.field_f;
          }
        }
    }

    final static boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 250) {
          L0: {
            int[] discarded$8 = uk.i(78);
            if (250 >= ad.field_h) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= ad.field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    uk(vg param0, vg param1, vg param2) {
        super(param0);
        ((uk) this).field_l = param2;
        ((uk) this).field_j = param1;
    }

    final static int a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -64) {
          if (param1 < 4096) {
            L0: {
              if (2048 > param1) {
                stackOut_9_0 = db.field_m[param1];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = db.field_m[4096 - param1];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (6144 > param1) {
                stackOut_5_0 = -db.field_m[param1 + -4096];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = -db.field_m[8192 - param1];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 94;
        }
    }

    private final boolean a(byte param0, String param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = param1;
        var3 = ((uk) this).field_l.field_i.toLowerCase();
        var4 = param1.toLowerCase();
        if (param0 >= 3) {
          if (-1 < var3.length()) {
            if ((var4.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (-1 + var3.length() > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (-1 < (var4.indexOf(var6) ^ -1)) {
                    if (0 > var4.indexOf(var7)) {
                      return false;
                    } else {
                      return true;
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
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_k = null;
          if (-1 > (var3.length() ^ -1)) {
            if ((var4.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if ((var5 ^ -1) <= -1) {
                if (-1 + var3.length() > var5) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(1 + var5);
                  if (-1 < var4.indexOf(var6)) {
                    if (0 <= var4.indexOf(var7)) {
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
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static int[] i(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = uk.h(48);
            return new int[8];
        }
        return new int[8];
    }

    public static void j(int param0) {
        field_k = null;
        if (param0 != 8191) {
            int discarded$0 = uk.a((byte) -70, 101);
        }
    }

    static {
    }
}
