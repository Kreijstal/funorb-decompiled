/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    private int[] field_a;

    final static String a(int param0) {
        if (kj.field_R >= 2) {
          if (param0 <= -98) {
            if (af.field_c != null) {
              if (!af.field_c.c((byte) -121)) {
                return wa.field_a;
              } else {
                return uf.field_r;
              }
            } else {
              if (lh.field_o.c((byte) -121)) {
                if (!lh.field_o.a(2, "commonui")) {
                  return vb.field_i + " - " + lh.field_o.d(-1, "commonui") + "%";
                } else {
                  if (wk.field_c.c((byte) -121)) {
                    if (!wk.field_c.a(2, "commonui")) {
                      return qb.field_bb + " - " + wk.field_c.d(-1, "commonui") + "%";
                    } else {
                      if (jk.field_ub.c((byte) -121)) {
                        if (!jk.field_ub.b(true)) {
                          return li.field_j + " - " + jk.field_ub.b((byte) -66) + "%";
                        } else {
                          return qf.field_g;
                        }
                      } else {
                        return bg.field_t;
                      }
                    }
                  } else {
                    return ri.field_d;
                  }
                }
              } else {
                return r.field_e;
              }
            }
          } else {
            return null;
          }
        } else {
          return jf.field_b;
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        if (0 != param4) {
          var7 = 0;
          if (param2 == 4) {
            param4 = param4 + param0;
            var8 = param1;
            L0: while (true) {
              L1: {
                var9 = param5[var8];
                if ((var9 ^ -1) <= -1) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((mc) this).field_a[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L2;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L2;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L3: {
                if (0 == (64 & var9)) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((mc) this).field_a[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L4;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L4;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L5: {
                if ((var9 & 32) != 0) {
                  var7 = ((mc) this).field_a[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L6;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L6;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L7: {
                if ((var9 & 16) != 0) {
                  var7 = ((mc) this).field_a[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L8;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L8;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L9: {
                if ((8 & var9) != 0) {
                  var7 = ((mc) this).field_a[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L10;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L10;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L11: {
                if ((var9 & 4) == 0) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((mc) this).field_a[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] < 0) {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param0 < param4) {
                    var7 = 0;
                    break L12;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if ((2 & var9) != 0) {
                  var7 = ((mc) this).field_a[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                L15: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] >= 0) {
                    break L15;
                  } else {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param4 <= param0) {
                      break L14;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  }
                }
                L16: {
                  if (0 == (var9 & 1)) {
                    var7++;
                    break L16;
                  } else {
                    var7 = ((mc) this).field_a[var7];
                    break L16;
                  }
                }
                L17: {
                  var10 = ((mc) this).field_a[var7];
                  if (-1 < (((mc) this).field_a[var7] ^ -1)) {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param4 <= param0) {
                      break L14;
                    } else {
                      var7 = 0;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                var8++;
                continue L0;
              }
              return var8 - (-1 - -param1);
            }
          } else {
            var12 = null;
            int discarded$1 = ((mc) this).a(71, -42, -78, (byte[]) null, -81, (byte[]) null);
            param4 = param4 + param0;
            var8 = param1;
            L18: while (true) {
              L19: {
                var9 = param5[var8];
                if ((var9 ^ -1) <= -1) {
                  var7++;
                  break L19;
                } else {
                  var7 = ((mc) this).field_a[var7];
                  break L19;
                }
              }
              L20: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L20;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L20;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L21: {
                if (0 == (64 & var9)) {
                  var7++;
                  break L21;
                } else {
                  var7 = ((mc) this).field_a[var7];
                  break L21;
                }
              }
              L22: {
                var10 = ((mc) this).field_a[var7];
                if (((mc) this).field_a[var7] >= 0) {
                  break L22;
                } else {
                  param0++;
                  param3[param0] = (byte)(var10 ^ -1);
                  if (param4 > param0) {
                    var7 = 0;
                    break L22;
                  } else {
                    return var8 - (-1 - -param1);
                  }
                }
              }
              L23: {
                if ((var9 & 32) != 0) {
                  var7 = ((mc) this).field_a[var7];
                  break L23;
                } else {
                  var7++;
                  break L23;
                }
              }
              L24: {
                L25: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] >= 0) {
                    break L25;
                  } else {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param4 > param0) {
                      var7 = 0;
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                L26: {
                  if ((var9 & 16) != 0) {
                    var7 = ((mc) this).field_a[var7];
                    break L26;
                  } else {
                    var7++;
                    break L26;
                  }
                }
                L27: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] >= 0) {
                    break L27;
                  } else {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param0 < param4) {
                      var7 = 0;
                      break L27;
                    } else {
                      return var8 - (-1 - -param1);
                    }
                  }
                }
                L28: {
                  if ((8 & var9) != 0) {
                    var7 = ((mc) this).field_a[var7];
                    break L28;
                  } else {
                    var7++;
                    break L28;
                  }
                }
                L29: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] >= 0) {
                    break L29;
                  } else {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param0 < param4) {
                      var7 = 0;
                      break L29;
                    } else {
                      break L24;
                    }
                  }
                }
                L30: {
                  if ((var9 & 4) == 0) {
                    var7++;
                    break L30;
                  } else {
                    var7 = ((mc) this).field_a[var7];
                    break L30;
                  }
                }
                L31: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] < 0) {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param0 < param4) {
                      var7 = 0;
                      break L31;
                    } else {
                      return var8 - (-1 - -param1);
                    }
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((2 & var9) != 0) {
                    var7 = ((mc) this).field_a[var7];
                    break L32;
                  } else {
                    var7++;
                    break L32;
                  }
                }
                L33: {
                  var10 = ((mc) this).field_a[var7];
                  if (((mc) this).field_a[var7] >= 0) {
                    break L33;
                  } else {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param4 <= param0) {
                      break L24;
                    } else {
                      var7 = 0;
                      break L33;
                    }
                  }
                }
                L34: {
                  if (0 == (var9 & 1)) {
                    var7++;
                    break L34;
                  } else {
                    var7 = ((mc) this).field_a[var7];
                    break L34;
                  }
                }
                L35: {
                  var10 = ((mc) this).field_a[var7];
                  if (-1 < (((mc) this).field_a[var7] ^ -1)) {
                    param0++;
                    param3[param0] = (byte)(var10 ^ -1);
                    if (param4 <= param0) {
                      break L24;
                    } else {
                      var7 = 0;
                      break L35;
                    }
                  } else {
                    break L35;
                  }
                }
                var8++;
                continue L18;
              }
              return var8 - (-1 - -param1);
            }
          }
        } else {
          return 0;
        }
    }

    final static ia a(String param0, byte param1) {
        String var2 = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param1 == 105) {
          if (null != ok.field_a) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                var2 = jg.a(var6, -2);
                if (var2 != null) {
                  var3 = (ia) (Object) ok.field_a.a((long)var2.hashCode(), true);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ib;
                      var4 = jg.a(var7, param1 ^ -105);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (ia) (Object) ok.field_a.a((byte) -9);
                        continue L0;
                      } else {
                        return var3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
