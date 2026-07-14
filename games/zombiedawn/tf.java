/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private fa field_a;
    static vn[] field_b;
    private fa field_d;
    static pc field_c;

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        if (-3 < (param3 ^ -1)) {
          throw new IllegalArgumentException("" + param3);
        } else {
          if ((param3 ^ -1) >= -37) {
            var4 = 0;
            if (param1 == 5) {
              L0: {
                var5 = 0;
                var6 = 0;
                var7 = param2.length();
                var8 = 0;
                if (var7 <= var8) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var9 = param2.charAt(var8);
                      if ((var8 ^ -1) == -1) {
                        L3: {
                          if (var9 == 45) {
                            var4 = 1;
                            var8++;
                            break L3;
                          } else {
                            if (var9 != 43) {
                              break L2;
                            } else {
                              if (param0) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var8++;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      L5: {
                        if (var9 < 48) {
                          break L5;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (65 > var9) {
                          break L6;
                        } else {
                          if (90 < var9) {
                            break L6;
                          } else {
                            var9 -= 55;
                            break L4;
                          }
                        }
                      }
                      L7: {
                        if (var9 < 97) {
                          break L7;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((var9 ^ -1) > (param3 ^ -1)) {
                      L8: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var10 = param3 * var6 - -var9;
                      if ((var6 ^ -1) != (var10 / param3 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                        break L1;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  var8++;
                  var8++;
                  var8++;
                  break L0;
                }
              }
              if (var5 != 0) {
                return var6;
              } else {
                throw new NumberFormatException();
              }
            } else {
              field_b = null;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L9: while (true) {
                if (var7 <= var8) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L10: {
                    L11: {
                      var9 = param2.charAt(var8);
                      if ((var8 ^ -1) == -1) {
                        if (var9 == 45) {
                          var4 = 1;
                          break L10;
                        } else {
                          if (var9 != 43) {
                            break L11;
                          } else {
                            if (param0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (var9 < 48) {
                          break L13;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (65 > var9) {
                          break L14;
                        } else {
                          if (90 < var9) {
                            break L14;
                          } else {
                            var9 -= 55;
                            break L12;
                          }
                        }
                      }
                      L15: {
                        if (var9 < 97) {
                          break L15;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if ((var9 ^ -1) > (param3 ^ -1)) {
                      L16: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var10 = param3 * var6 - -var9;
                      if ((var6 ^ -1) != (var10 / param3 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var5 = 1;
                        var6 = var10;
                        break L10;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L9;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        }
    }

    final fa b(int param0) {
        fa var2 = ((tf) this).field_a.field_q;
        if (var2 == ((tf) this).field_a) {
            ((tf) this).field_d = null;
            return null;
        }
        int var3 = 59 % ((-16 - param0) / 44);
        ((tf) this).field_d = var2.field_q;
        return var2;
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -12220) {
            field_b = null;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        var3 = ZombieDawn.field_J;
        kd.field_nb[0] = sg.field_jb.d(16711680);
        kd.field_nb[1] = sg.field_jb.d(7829248);
        kd.field_nb[2] = sg.field_jb.d(16776960);
        kd.field_nb[3] = sg.field_jb.d(30464);
        kd.field_nb[4] = sg.field_jb.d(65280);
        kd.field_nb[5] = sg.field_jb.d(30583);
        kd.field_nb[6] = sg.field_jb.d(65535);
        kd.field_nb[7] = sg.field_jb.d(119);
        kd.field_nb[8] = sg.field_jb.d(255);
        kd.field_nb[9] = sg.field_jb.d(16745473);
        hm.field_L = sg.field_jb.d(16777215);
        t.field_c = sg.field_jb.d(6710886);
        var8 = sg.field_jb.field_O[0];
        var7 = var8;
        var6 = var7;
        var5 = var6;
        var4 = var5;
        var1 = var4;
        if (param0 == 119) {
          sg.field_jb.field_O = new int[11][];
          sg.field_jb.field_O[0] = var8;
          sg.field_jb.field_O[4] = new int[sg.field_jb.field_O[0].length];
          var2 = 0;
          L0: while (true) {
            if ((sg.field_jb.field_O[4].length ^ -1) >= (var2 ^ -1)) {
              rf.a(16777215, 2, 65793, 13369344, 119);
              rf.a(4194304, 0, 8388608, 16711680, 83);
              rf.a(16777215, 1, 65793, 5481009, 86);
              rf.a(4210688, 3, 8421376, 16776960, 76);
              rf.a(0, 5, 0, 0, 121);
              rf.a(0, 6, 4473924, 10066329, param0 + -40);
              rf.a(16777215, 7, 4473924, 10066329, 108);
              rf.a(0, 8, 4996418, 14540253, param0 + -50);
              rf.a(0, 9, 16777215, 14540253, 76);
              rf.a(4096, 10, 16384, 5481009, param0 ^ 29);
              return;
            } else {
              sg.field_jb.field_O[4][var2] = 16777215;
              var2++;
              continue L0;
            }
          }
        } else {
          field_b = null;
          sg.field_jb.field_O = new int[11][];
          sg.field_jb.field_O[0] = var8;
          sg.field_jb.field_O[4] = new int[sg.field_jb.field_O[0].length];
          var2 = 0;
          L1: while (true) {
            if ((sg.field_jb.field_O[4].length ^ -1) >= (var2 ^ -1)) {
              rf.a(16777215, 2, 65793, 13369344, 119);
              rf.a(4194304, 0, 8388608, 16711680, 83);
              rf.a(16777215, 1, 65793, 5481009, 86);
              rf.a(4210688, 3, 8421376, 16776960, 76);
              rf.a(0, 5, 0, 0, 121);
              rf.a(0, 6, 4473924, 10066329, param0 + -40);
              rf.a(16777215, 7, 4473924, 10066329, 108);
              rf.a(0, 8, 4996418, 14540253, param0 + -50);
              rf.a(0, 9, 16777215, 14540253, 76);
              rf.a(4096, 10, 16384, 5481009, param0 ^ 29);
              return;
            } else {
              sg.field_jb.field_O[4][var2] = 16777215;
              var2++;
              continue L1;
            }
          }
        }
    }

    public tf() {
        ((tf) this).field_a = new fa();
        ((tf) this).field_a.field_q = ((tf) this).field_a;
        ((tf) this).field_a.field_r = ((tf) this).field_a;
    }

    final fa a(int param0) {
        fa var2 = ((tf) this).field_d;
        if (!(((tf) this).field_a != var2)) {
            ((tf) this).field_d = null;
            return null;
        }
        if (param0 != -6116) {
            tf.c(43);
            ((tf) this).field_d = var2.field_q;
            return var2;
        }
        ((tf) this).field_d = var2.field_q;
        return var2;
    }

    final void a(byte param0, fa param1) {
        if (null != param1.field_r) {
            param1.d(0);
            param1.field_r = ((tf) this).field_a.field_r;
            param1.field_q = ((tf) this).field_a;
            param1.field_r.field_q = param1;
            param1.field_q.field_r = param1;
            if (param0 > 16) {
                return;
            }
            ((tf) this).field_d = null;
            return;
        }
        param1.field_r = ((tf) this).field_a.field_r;
        param1.field_q = ((tf) this).field_a;
        param1.field_r.field_q = param1;
        param1.field_q.field_r = param1;
        if (param0 <= 16) {
            ((tf) this).field_d = null;
            return;
        }
    }

    static {
    }
}
