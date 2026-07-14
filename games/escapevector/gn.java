/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static hh field_e;
    boolean field_i;
    private int field_c;
    private dc field_m;
    static int[] field_k;
    private kg field_f;
    int field_j;
    static String field_b;
    int field_n;
    private cn field_h;
    int field_d;
    private boolean field_a;
    private int field_g;
    static String field_l;

    final void b(int param0) {
        Object var2 = null;
        de var2_ref = null;
        int var3 = 0;
        Object var4 = null;
        cc var5 = null;
        var4 = null;
        var2 = null;
        var3 = EscapeVector.field_A;
        if (param0 == 7108) {
          if (!aj.b(-128)) {
            if (((gn) this).field_d == 0) {
              L0: while (true) {
                var5 = (cc) (Object) ((gn) this).field_h.c(-20245);
                if (var5 != null) {
                  oc.a(5, (byte) -107, var5);
                  continue L0;
                } else {
                  if ((((gn) this).field_d ^ -1) == -2) {
                    L1: while (true) {
                      var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                      if (var2_ref != null) {
                        ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                        continue L1;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              if ((((gn) this).field_d ^ -1) == -2) {
                L2: while (true) {
                  var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                  if (var2_ref != null) {
                    ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                    continue L2;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((gn) this).field_j = 78;
          if (!aj.b(-128)) {
            if (((gn) this).field_d != 0) {
              if ((((gn) this).field_d ^ -1) == -2) {
                L3: while (true) {
                  var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                  if (var2_ref != null) {
                    ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L4: while (true) {
                var5 = (cc) (Object) ((gn) this).field_h.c(-20245);
                if (var5 != null) {
                  oc.a(5, (byte) -107, var5);
                  continue L4;
                } else {
                  if ((((gn) this).field_d ^ -1) == -2) {
                    L5: while (true) {
                      var2_ref = (de) (Object) ((gn) this).field_h.c(param0 + -27353);
                      if (var2_ref != null) {
                        ((gn) this).field_f.a(((gn) this).field_c, var2_ref.field_g, param0 ^ -19601);
                        continue L5;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = -18 / ((73 - param0) / 34);
    }

    public static void b(boolean param0) {
        field_e = null;
        field_l = null;
        if (param0) {
            return;
        }
        field_k = null;
        field_b = null;
    }

    private final void d(int param0) {
        if (param0 <= 25) {
            ((gn) this).field_g = 98;
            return;
        }
    }

    final static void a(dk[] param0, boolean param1, byte param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var7 = 0;
        dk var8 = null;
        int var9 = 0;
        Object var10 = null;
        int[] var11 = null;
        dk[] var12 = null;
        dk var13 = null;
        dk[] var14 = null;
        dk var15 = null;
        var9 = EscapeVector.field_A;
        if (param0 == null) {
          return;
        } else {
          L0: {
            var11 = new int[]{3170352, 8421504, 8421504};
            if (!param1) {
              var5 = new int[]{6340704, 16777215, 16777215};
              var4 = new int[]{6340704, 16777215, 16777215};
              break L0;
            } else {
              var5 = new int[]{5275728, 16777215, 10551200};
              var4 = new int[]{5275728, 16777215, 6340704};
              break L0;
            }
          }
          L1: {
            if (param2 == 41) {
              break L1;
            } else {
              var10 = null;
              int discarded$1 = gn.a(126, (CharSequence) null);
              var12 = param0;
              var7 = 0;
              if (var12.length > var7) {
                L2: {
                  var13 = var12[var7];
                  var8 = var13;
                  if (var8 == null) {
                    var7++;
                    break L2;
                  } else {
                    var13.a(var4, var11, (byte) -123, var5);
                    var7++;
                    break L2;
                  }
                }
                var7++;
                var7++;
                var7++;
                break L1;
              } else {
                return;
              }
            }
          }
          var14 = param0;
          var7 = 0;
          L3: while (true) {
            if (var14.length > var7) {
              var15 = var14[var7];
              var8 = var15;
              if (var8 == null) {
                var7++;
                var7++;
                continue L3;
              } else {
                var15.a(var4, var11, (byte) -123, var5);
                var7++;
                continue L3;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        if (-1 < (param1 ^ -1)) {
          return false;
        } else {
          var3 = je.a(false, ((gn) this).field_j);
          if (var3 > param1) {
            if (param0 != ((gn) this).field_d) {
              if (-2 == (((gn) this).field_d ^ -1)) {
                return true;
              } else {
                return false;
              }
            } else {
              return this.a(true, param1);
            }
          } else {
            return false;
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        if (((gn) this).field_i) {
          if ((param0 ^ -1) <= -1) {
            var3 = je.a(false, ((gn) this).field_j);
            if (param0 < var3) {
              if (0 == ((gn) this).field_d) {
                if (param0 >= ((gn) this).field_n) {
                  if (((gn) this).field_n != param0) {
                    var4 = -109 / ((37 - param1) / 36);
                    if (((gn) this).field_d == 1) {
                      if (!this.a(param0, (byte) 67)) {
                        if (!((gn) this).field_f.a(param0, true, ((gn) this).field_g)) {
                          return -1;
                        } else {
                          return 0;
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                var4 = -109 / ((37 - param1) / 36);
                if (((gn) this).field_d == 1) {
                  if (!this.a(param0, (byte) 67)) {
                    if (!((gn) this).field_f.a(param0, true, ((gn) this).field_g)) {
                      return -1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static int a(int param0, CharSequence param1) {
        if (param0 != 16777215) {
            gn.b(true);
            return wk.a(true, 10, param1, 97);
        }
        return wk.a(true, 10, param1, 97);
    }

    final void a(byte param0, int param1, int[] param2) {
        int var4 = 0;
        de var5 = null;
        if (param2 != null) {
          if (4 != param2.length) {
            return;
          } else {
            if (param1 > -1) {
              return;
            } else {
              var4 = je.a(false, ((gn) this).field_j);
              if (var4 > param1) {
                if (-1 != ((gn) this).field_d) {
                  L0: {
                    if (null != ((gn) this).field_h) {
                      break L0;
                    } else {
                      ((gn) this).field_h = new cn();
                      break L0;
                    }
                  }
                  if (0 != ((gn) this).field_d) {
                    L1: {
                      if (1 == ((gn) this).field_d) {
                        var5 = new de(param1);
                        ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param0 != -15) {
                      boolean discarded$7 = ((gn) this).a(-9, -123);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((gn) this).field_n = 1 + param1;
                    if (((gn) this).field_n < var4) {
                      L2: {
                        var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                        ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                        this.d(87);
                        if (1 == ((gn) this).field_d) {
                          var5 = new de(param1);
                          ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 == -15) {
                        return;
                      } else {
                        boolean discarded$8 = ((gn) this).a(-9, -123);
                        return;
                      }
                    } else {
                      ((gn) this).field_n = var4 + -1;
                      L3: {
                        var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                        ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                        this.d(87);
                        if (1 == ((gn) this).field_d) {
                          var5 = new de(param1);
                          ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (param0 == -15) {
                        return;
                      } else {
                        boolean discarded$9 = ((gn) this).a(-9, -123);
                        return;
                      }
                    }
                  }
                } else {
                  if (this.a(true, param1)) {
                    if (null == ((gn) this).field_h) {
                      ((gn) this).field_h = new cn();
                      if (0 == ((gn) this).field_d) {
                        ((gn) this).field_n = 1 + param1;
                        if (((gn) this).field_n < var4) {
                          L4: {
                            var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                            ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                            this.d(87);
                            if (1 == ((gn) this).field_d) {
                              var5 = new de(param1);
                              ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (param0 == -15) {
                            return;
                          } else {
                            boolean discarded$10 = ((gn) this).a(-9, -123);
                            return;
                          }
                        } else {
                          ((gn) this).field_n = var4 + -1;
                          L5: {
                            var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                            ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                            this.d(87);
                            if (1 == ((gn) this).field_d) {
                              var5 = new de(param1);
                              ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (param0 == -15) {
                            return;
                          } else {
                            boolean discarded$11 = ((gn) this).a(-9, -123);
                            return;
                          }
                        }
                      } else {
                        L6: {
                          if (1 == ((gn) this).field_d) {
                            var5 = new de(param1);
                            ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (param0 == -15) {
                          return;
                        } else {
                          boolean discarded$12 = ((gn) this).a(-9, -123);
                          return;
                        }
                      }
                    } else {
                      L7: {
                        if (0 != ((gn) this).field_d) {
                          break L7;
                        } else {
                          ((gn) this).field_n = 1 + param1;
                          if (((gn) this).field_n < var4) {
                            var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                            ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                            this.d(87);
                            break L7;
                          } else {
                            ((gn) this).field_n = var4 + -1;
                            var5 = (de) (Object) new cc(((gn) this).field_j, param1, param2[0], param2[1], param2[2], param2[3]);
                            ((gn) this).field_h.a(-12328, (hg) (Object) var5);
                            this.d(87);
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (1 == ((gn) this).field_d) {
                          var5 = new de(param1);
                          ((gn) this).field_h.a(param0 + -12313, (hg) (Object) var5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (param0 == -15) {
                        return;
                      } else {
                        boolean discarded$13 = ((gn) this).a(-9, -123);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (((gn) this).field_h == null) {
            return false;
          } else {
            L0: {
              if (((gn) this).field_h.a(-100)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            }
            return stackIn_12_0 != 0;
          }
        } else {
          boolean discarded$6 = ((gn) this).a(false);
          if (((gn) this).field_h == null) {
            return false;
          } else {
            L1: {
              if (((gn) this).field_h.a(-100)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    gn(int param0, int param1, int param2, int param3, boolean param4, kg param5) {
        this(param0, param1, param5);
        ((gn) this).field_a = param4 ? true : false;
        ((gn) this).field_g = param3;
        ((gn) this).field_c = param2;
    }

    final static void a(int param0) {
        if (param0 > -107) {
            Object var2 = null;
            gn.a((dk[]) null, false, (byte) -37);
            uk.b(0);
            return;
        }
        uk.b(0);
    }

    private final boolean a(boolean param0, int param1) {
        if (param1 != ((gn) this).field_n) {
          if (((gn) this).field_a) {
            if (bj.e((byte) 104)) {
              L0: {
                if (!aj.b(-117)) {
                  break L0;
                } else {
                  if (-1 == ((gn) this).field_n) {
                    if (0 != param1) {
                      break L0;
                    } else {
                      return true;
                    }
                  } else {
                    if (!param0) {
                      int discarded$5 = ((gn) this).b(-96, 125);
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
              if (!param0) {
                int discarded$6 = ((gn) this).b(-96, 125);
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (aj.b(-117)) {
              if (-1 == ((gn) this).field_n) {
                if (0 != param1) {
                  if (!param0) {
                    int discarded$7 = ((gn) this).b(-96, 125);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (!param0) {
                  int discarded$8 = ((gn) this).b(-96, 125);
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              if (!param0) {
                int discarded$9 = ((gn) this).b(-96, 125);
                return false;
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final boolean a(int param0, byte param1) {
        hg var3 = null;
        int var5 = 0;
        de var6 = null;
        de var7 = null;
        var5 = EscapeVector.field_A;
        if (-2 != (((gn) this).field_d ^ -1)) {
          return false;
        } else {
          if (((gn) this).field_h == null) {
            return false;
          } else {
            if (((gn) this).field_h.a(-110)) {
              return false;
            } else {
              if (param1 > 36) {
                var3 = ((gn) this).field_h.a(false);
                L0: while (true) {
                  if (var3 != null) {
                    var6 = (de) (Object) var3;
                    if (param0 != var6.field_g) {
                      var3 = ((gn) this).field_h.b((byte) 70);
                      continue L0;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                boolean discarded$8 = this.a(true, 29);
                var3 = ((gn) this).field_h.a(false);
                L1: while (true) {
                  if (var3 != null) {
                    var7 = (de) (Object) var3;
                    if (param0 != var7.field_g) {
                      var3 = ((gn) this).field_h.b((byte) 70);
                      continue L1;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        if (param0 == 5) {
          if (!((gn) this).field_i) {
            if (!((gn) this).field_a) {
              if (((gn) this).field_d == 0) {
                L0: {
                  if (((gn) this).field_m == null) {
                    ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                ((gn) this).field_i = ((gn) this).field_m.field_g;
                if (((gn) this).field_i) {
                  var2 = ((gn) this).field_m.field_h[0];
                  if (((gn) this).field_a) {
                    ((gn) this).field_n = var2;
                    ((gn) this).field_m = null;
                    this.a((byte) -7);
                    return;
                  } else {
                    if (var2 > ((gn) this).field_n) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    } else {
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (1 == ((gn) this).field_d) {
                  ((gn) this).field_i = ((gn) this).field_f.e(0);
                  return;
                } else {
                  ((gn) this).field_i = false;
                  return;
                }
              }
            } else {
              if (bj.e((byte) 101)) {
                if (((gn) this).field_d == 0) {
                  L1: {
                    if (((gn) this).field_m == null) {
                      ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((gn) this).field_i = ((gn) this).field_m.field_g;
                  if (((gn) this).field_i) {
                    var2 = ((gn) this).field_m.field_h[0];
                    if (((gn) this).field_a) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      return;
                    } else {
                      if (var2 > ((gn) this).field_n) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      } else {
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (1 == ((gn) this).field_d) {
                    ((gn) this).field_i = ((gn) this).field_f.e(0);
                    return;
                  } else {
                    ((gn) this).field_i = false;
                    return;
                  }
                }
              } else {
                ((gn) this).field_i = true;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          boolean discarded$1 = ((gn) this).a(true);
          if (!((gn) this).field_i) {
            if (((gn) this).field_a) {
              if (!bj.e((byte) 101)) {
                ((gn) this).field_i = true;
                return;
              } else {
                if (((gn) this).field_d == 0) {
                  L2: {
                    if (((gn) this).field_m == null) {
                      ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    ((gn) this).field_i = ((gn) this).field_m.field_g;
                    if (((gn) this).field_i) {
                      var2 = ((gn) this).field_m.field_h[0];
                      if (((gn) this).field_a) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        return;
                      } else {
                        if (var2 > ((gn) this).field_n) {
                          ((gn) this).field_n = var2;
                          ((gn) this).field_m = null;
                          this.a((byte) -7);
                          return;
                        } else {
                          ((gn) this).field_m = null;
                          this.a((byte) -7);
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  if (1 == ((gn) this).field_d) {
                    ((gn) this).field_i = ((gn) this).field_f.e(0);
                    return;
                  } else {
                    ((gn) this).field_i = false;
                    return;
                  }
                }
              }
            } else {
              if (((gn) this).field_d == 0) {
                L4: {
                  if (((gn) this).field_m == null) {
                    ((gn) this).field_m = wc.a(((gn) this).field_j, 5, 1, (byte) -51);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((gn) this).field_i = ((gn) this).field_m.field_g;
                  if (((gn) this).field_i) {
                    var2 = ((gn) this).field_m.field_h[0];
                    if (((gn) this).field_a) {
                      ((gn) this).field_n = var2;
                      ((gn) this).field_m = null;
                      this.a((byte) -7);
                      break L5;
                    } else {
                      if (var2 > ((gn) this).field_n) {
                        ((gn) this).field_n = var2;
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        break L5;
                      } else {
                        ((gn) this).field_m = null;
                        this.a((byte) -7);
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                if (1 == ((gn) this).field_d) {
                  ((gn) this).field_i = ((gn) this).field_f.e(0);
                  return;
                } else {
                  ((gn) this).field_i = false;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private gn(int param0, int param1, kg param2) {
        ((gn) this).field_c = -1;
        ((gn) this).field_g = -1;
        ((gn) this).field_d = param1;
        ((gn) this).field_j = param0;
        ((gn) this).field_n = -1;
        ((gn) this).field_f = param2;
        ((gn) this).field_i = false;
        if (1 == ((gn) this).field_d) {
            ((gn) this).field_i = ((gn) this).field_f.e(0);
        }
        ((gn) this).field_h = new cn();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords can only contain letters and numbers";
        field_l = "Rock buster";
    }
}
