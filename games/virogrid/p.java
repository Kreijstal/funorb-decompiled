/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_d;
    static km field_a;
    static int field_h;
    static ul field_b;
    static byte[] field_e;
    l field_i;
    private l field_c;
    static String field_g;
    static boolean field_f;

    final l b(boolean param0) {
        l var2 = null;
        if (param0) {
            field_a = null;
            var2 = ((p) this).field_i.field_a;
            if (!(((p) this).field_i != var2)) {
                ((p) this).field_c = null;
                return null;
            }
            ((p) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((p) this).field_i.field_a;
        if (!(((p) this).field_i != var2)) {
            ((p) this).field_c = null;
            return null;
        }
        ((p) this).field_c = var2.field_a;
        return var2;
    }

    final void a(boolean param0) {
        l var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((p) this).field_i.field_f;
          if (var2 != ((p) this).field_i) {
            var2.a(false);
            continue L0;
          } else {
            ((p) this).field_c = null;
            if (!param0) {
              return;
            } else {
              var4 = null;
              l discarded$1 = ((p) this).a(-4, (l) null);
              return;
            }
          }
        }
    }

    final void b(l param0, byte param1) {
        Object var4 = null;
        if (null == param0.field_a) {
          param0.field_a = ((p) this).field_i;
          param0.field_f = ((p) this).field_i.field_f;
          param0.field_a.field_f = param0;
          if (param1 != -45) {
            var4 = null;
            int discarded$2 = p.a(-77, -60, false, (CharSequence) null);
            param0.field_f.field_a = param0;
            return;
          } else {
            param0.field_f.field_a = param0;
            return;
          }
        } else {
          param0.a(false);
          param0.field_a = ((p) this).field_i;
          param0.field_f = ((p) this).field_i.field_f;
          param0.field_a.field_f = param0;
          if (param1 == -45) {
            param0.field_f.field_a = param0;
            return;
          } else {
            var4 = null;
            int discarded$3 = p.a(-77, -60, false, (CharSequence) null);
            param0.field_f.field_a = param0;
            return;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (df.field_f >= param1 + param3 + param2) {
            return param2 + param3;
        }
        if (!((-param1 + param2 ^ -1) > param0)) {
            return param2 - param1;
        }
        return -param1 + df.field_f;
    }

    final l d(int param0) {
        l var2 = null;
        var2 = ((p) this).field_i.field_f;
        if (((p) this).field_i != var2) {
          if (param0 != -29889) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final l b(int param0) {
        int var2 = 0;
        l var3 = null;
        var2 = -93 / ((-46 - param0) / 34);
        var3 = ((p) this).field_i.field_a;
        if (((p) this).field_i == var3) {
          return null;
        } else {
          var3.a(false);
          return var3;
        }
    }

    final l e(int param0) {
        l var2 = null;
        if (param0 != 9003) {
            field_d = -121;
            var2 = ((p) this).field_c;
            if (!(((p) this).field_i != var2)) {
                ((p) this).field_c = null;
                return null;
            }
            ((p) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((p) this).field_c;
        if (!(((p) this).field_i != var2)) {
            ((p) this).field_c = null;
            return null;
        }
        ((p) this).field_c = var2.field_a;
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, lk param5, um param6) {
        dj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ai.a(-1, param6, (int[]) null, param5.field_Eb, param5.field_Ob, param5.field_Nb, -1, (km) (Object) param5, 60);
        md.field_e.a(true, (byte) -126);
        md.field_e.a(4, (int[]) null, 0);
        md.field_e.a((byte) -110);
        if (param2) {
          return;
        } else {
          var7 = md.field_e;
          var8 = param1;
          var9 = param3;
          var10 = param4;
          var11 = param0;
          var7.field_a.a(var11, 0, var10, var8, var9);
          return;
        }
    }

    final l a(int param0) {
        l var2 = null;
        var2 = ((p) this).field_c;
        if (var2 != ((p) this).field_i) {
          if (param0 != 16213) {
            l discarded$2 = ((p) this).b(true);
            ((p) this).field_c = var2.field_f;
            return var2;
          } else {
            ((p) this).field_c = var2.field_f;
            return var2;
          }
        } else {
          ((p) this).field_c = null;
          return null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        var3 = 1;
        if (param2 >= -95) {
          return 81;
        } else {
          L0: while (true) {
            if ((param0 ^ -1) >= -2) {
              if (param0 == 1) {
                return var3 * param1;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (-1 == (param0 & 1 ^ -1)) {
                  break L1;
                } else {
                  var3 = var3 * param1;
                  break L1;
                }
              }
              param0 = param0 >> 1;
              param1 = param1 * param1;
              continue L0;
            }
          }
        }
    }

    final l a(int param0, l param1) {
        l var3 = null;
        if (param0 == 480) {
          L0: {
            if (param1 != null) {
              var3 = param1;
              break L0;
            } else {
              var3 = ((p) this).field_i.field_f;
              break L0;
            }
          }
          if (((p) this).field_i == var3) {
            ((p) this).field_c = null;
            return null;
          } else {
            ((p) this).field_c = var3.field_f;
            return var3;
          }
        } else {
          L1: {
            field_h = 13;
            if (param1 != null) {
              var3 = param1;
              break L1;
            } else {
              var3 = ((p) this).field_i.field_f;
              break L1;
            }
          }
          if (((p) this).field_i == var3) {
            ((p) this).field_c = null;
            return null;
          } else {
            ((p) this).field_c = var3.field_f;
            return var3;
          }
        }
    }

    final l a(byte param0) {
        l var2 = null;
        var2 = ((p) this).field_i.field_f;
        if (var2 == ((p) this).field_i) {
          ((p) this).field_c = null;
          return null;
        } else {
          ((p) this).field_c = var2.field_f;
          if (param0 >= -20) {
            int discarded$2 = p.a(-111, 78, -112);
            return var2;
          } else {
            return var2;
          }
        }
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 > -27) {
          var2 = null;
          int discarded$2 = p.a(-2, 62, false, (CharSequence) null);
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final void a(l param0, byte param1) {
        Object var4 = null;
        if (param0.field_a == null) {
          param0.field_a = ((p) this).field_i.field_a;
          param0.field_f = ((p) this).field_i;
          if (param1 > -30) {
            var4 = null;
            ((p) this).b((l) null, (byte) 27);
            param0.field_a.field_f = param0;
            param0.field_f.field_a = param0;
            return;
          } else {
            param0.field_a.field_f = param0;
            param0.field_f.field_a = param0;
            return;
          }
        } else {
          param0.a(false);
          param0.field_a = ((p) this).field_i.field_a;
          param0.field_f = ((p) this).field_i;
          if (param1 <= -30) {
            param0.field_a.field_f = param0;
            param0.field_f.field_a = param0;
            return;
          } else {
            var4 = null;
            ((p) this).b((l) null, (byte) 27);
            param0.field_a.field_f = param0;
            param0.field_f.field_a = param0;
            return;
          }
        }
    }

    final static eh a(int param0, int param1) {
        if (param0 < 32) {
          field_e = null;
          return va.a(1, false, param1, -105, true, false);
        } else {
          return va.a(1, false, param1, -105, true, false);
        }
    }

    final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 7) {
          L0: {
            var3 = null;
            l discarded$6 = ((p) this).a(-30, (l) null);
            if (((p) this).field_i.field_f != ((p) this).field_i) {
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
            if (((p) this).field_i.field_f != ((p) this).field_i) {
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

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if (2 <= param0) {
          if (-37 <= (param0 ^ -1)) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            if (param1 == 4330) {
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
                    var9 = param3.charAt(var8);
                    if (var8 != 0) {
                      break L1;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param2) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L0;
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
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (122 < var9) {
                          break L5;
                        } else {
                          var9 -= 87;
                          break L2;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 <= var9) {
                    throw new NumberFormatException();
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var10 / param0 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            } else {
              field_f = false;
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
                    var9 = param3.charAt(var8);
                    if (var8 != 0) {
                      break L8;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param2) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L7;
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
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (122 < var9) {
                          break L12;
                        } else {
                          var9 -= 87;
                          break L9;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param0 <= var9) {
                    throw new NumberFormatException();
                  } else {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var10 / param0 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    } else {
                      throw new NumberFormatException();
                    }
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

    public p() {
        ((p) this).field_i = new l();
        ((p) this).field_i.field_f = ((p) this).field_i;
        ((p) this).field_i.field_a = ((p) this).field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 480;
        field_b = new ul(2);
        field_g = "Find opponents";
        field_f = false;
    }
}
