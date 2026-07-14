/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends bq {
    static int field_f;
    static int field_e;

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 39) {
            field_e = -61;
        }
    }

    ra(fr param0) {
        super(param0);
    }

    final boolean b(byte param0) {
        if (param0 > -64) {
            Object var3 = null;
            boolean discarded$0 = ra.a(-87, (CharSequence) null, 43, true);
            return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        ((ra) this).field_b.a(param0 + 45, param2);
        if (param0 != 35) {
          ((ra) this).a((byte) -49, true);
          ((ra) this).field_b.c(param1, true);
          return;
        } else {
          ((ra) this).field_b.c(param1, true);
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
            boolean discarded$0 = ((ra) this).b((byte) -11);
        }
    }

    final void a(byte param0, boolean param1) {
        ((ra) this).field_b.b(true, (byte) -74);
        if (param0 < 33) {
            ((ra) this).a((byte) 55, 7, -88);
        }
    }

    final void b(int param0) {
        if (param0 >= -125) {
            field_e = 78;
            ((ra) this).field_b.b(false, (byte) -81);
            return;
        }
        ((ra) this).field_b.b(false, (byte) -81);
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != 2) {
            java.applet.Applet discarded$6 = ra.c(-55);
            if (!(qj.field_c == null)) {
                return qj.field_c;
            }
            return (java.applet.Applet) (Object) ke.field_a;
        }
        if (!(qj.field_c == null)) {
            return qj.field_c;
        }
        return (java.applet.Applet) (Object) ke.field_a;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (param2 == -46) {
          if (2 <= param0) {
            if ((param0 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = param1.charAt(var8);
                    if (var8 != 0) {
                      break L1;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param3) {
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
                        if (122 >= var9) {
                          var9 -= 87;
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param0) {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var6 * param0 + var9;
                    if (var10 / param0 != var6) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          java.applet.Applet discarded$1 = ra.c(-41);
          if (2 <= param0) {
            if ((param0 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param1.charAt(var8);
                    if (var8 != 0) {
                      break L8;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param3) {
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
                        if (122 >= var9) {
                          var9 -= 87;
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param0) {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var6 * param0 + var9;
                    if (var10 / param0 != var6) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L7;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
