/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends me {
    private rg field_o;
    private rg field_k;
    static int field_m;
    static int field_l;
    static int[] field_j;
    static boolean field_n;

    final rc a(int param0, String param1) {
        if (param0 != 95) {
            return null;
        }
        String var3 = ((bg) this).field_o.field_k.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return ec.field_d;
        }
        if (!(be.a(var4, param0 + -95, var3))) {
            return ec.field_d;
        }
        if (!(!this.b(param1, param0 ^ -8680))) {
            return ec.field_d;
        }
        return hi.field_b;
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var7 = null;
        Object var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        var7 = param0;
        var3 = ((bg) this).field_k.field_k.toLowerCase();
        if (param1 == -8633) {
          var12 = param0.toLowerCase();
          if (0 < var3.length()) {
            if (var12.length() > 0) {
              var5 = var3.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < var3.length() - 1) {
                  var13 = var3.substring(0, var5);
                  var14 = var3.substring(1 + var5);
                  if (0 > var12.indexOf(var13)) {
                    if (0 > var12.indexOf(var14)) {
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
          var8 = null;
          int discarded$1 = bg.a(-22, true, (CharSequence) null, (byte) 13);
          var9 = param0.toLowerCase();
          var4 = var9;
          if (0 < var3.length()) {
            if (var9.length() > 0) {
              var5 = var3.lastIndexOf("@");
              if (var5 >= 0) {
                if (var5 < var3.length() - 1) {
                  var10 = var3.substring(0, var5);
                  var11 = var3.substring(1 + var5);
                  var7 = var11;
                  if (0 > var9.indexOf(var10)) {
                    if (0 > var9.indexOf(var11)) {
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
        }
    }

    bg(rg param0, rg param1, rg param2) {
        super(param0);
        ((bg) this).field_o = param1;
        ((bg) this).field_k = param2;
    }

    final String b(int param0, String param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((bg) this).field_o.field_k.toLowerCase();
        var4 = param1.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (vj.a(-23424, var5)) {
            return ob.field_I;
          } else {
            if (ga.a(var5, 3336)) {
              return qe.field_H;
            } else {
              if (ve.a(1, var5)) {
                return ri.field_i;
              } else {
                if (this.b(param1, param0 ^ 8632)) {
                  return gb.field_d;
                } else {
                  if ((var6.length() ^ -1) < param0) {
                    if (!fc.a((byte) 19, var5, var6)) {
                      if (fk.a(var6, (byte) 34, var5)) {
                        return qj.field_c;
                      } else {
                        if (me.a(var6, (byte) 119, var5)) {
                          return ae.field_b;
                        } else {
                          return ob.field_I;
                        }
                      }
                    } else {
                      return ae.field_b;
                    }
                  } else {
                    return q.field_g;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (-3 >= (param0 ^ -1)) {
          if (36 >= param0) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            if (param3 == 126) {
              var8 = 0;
              L0: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L1: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L1;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L0;
                      } else {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param1) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var9 -= 55;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 > var9) {
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        var9 = -var9;
                        break L6;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var6 != var10 / param0) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              field_l = 51;
              var8 = 0;
              L7: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L8: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L8;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L7;
                      } else {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param1) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (var9 > 90) {
                          break L11;
                        } else {
                          var9 -= 55;
                          break L9;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (122 >= var9) {
                          var9 -= 87;
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 > var9) {
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        var9 = -var9;
                        break L13;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var6 != var10 / param0) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          throw new IllegalArgumentException("" + param0);
        }
    }

    final static void a(byte param0, String param1) {
        if (param0 > -99) {
            bg.b((byte) -60);
        }
    }

    final static boolean g(int param0) {
        int var1 = -97 % ((18 - param0) / 49);
        return lb.field_d;
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 != 54) {
            bg.b((byte) -109);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
