/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    static je field_m;
    private gd field_a;
    private int field_f;
    static wk field_b;
    private int field_j;
    int[] field_e;
    static wk[] field_d;
    private int field_c;
    static String field_h;
    static int field_i;
    private vj field_g;
    private boolean field_k;
    private boolean field_l;

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = ((hr) this).field_e[0];
        if (param0 != -72) {
          ((hr) this).a((byte) 11, true);
          var4 = ((hr) this).field_e[1];
          this.a(false, param1, var3, var4);
          return;
        } else {
          var4 = ((hr) this).field_e[1];
          this.a(false, param1, var3, var4);
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 != -298276720) {
            String discarded$0 = hr.b((byte) -86);
            field_m = null;
            return;
        }
        field_m = null;
    }

    private final void a(boolean param0, int param1, int param2) {
        ((hr) this).field_g = new vj(1);
        if (!param0) {
          field_h = null;
          ((hr) this).a((byte) 125, param2);
          ((hr) this).field_f = -1;
          ((hr) this).a(-23162, 0);
          tm.a();
          ((hr) this).field_e = new int[2];
          ((hr) this).field_j = param1;
          return;
        } else {
          ((hr) this).a((byte) 125, param2);
          ((hr) this).field_f = -1;
          ((hr) this).a(-23162, 0);
          tm.a();
          ((hr) this).field_e = new int[2];
          ((hr) this).field_j = param1;
          return;
        }
    }

    final void a(byte param0, int param1) {
        ((hr) this).field_c = param1;
        if (((hr) this).field_c >= 0) {
          if (mn.field_k.length > ((hr) this).field_c) {
            if (mn.field_k[((hr) this).field_c] != null) {
              if (param0 < 42) {
                ((hr) this).a(54, 25, (byte) -41);
                ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
                ((hr) this).field_k = nh.field_D[((hr) this).field_c];
                return;
              } else {
                ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
                ((hr) this).field_k = nh.field_D[((hr) this).field_c];
                return;
              }
            } else {
              ((hr) this).field_c = 0;
              if (param0 < 42) {
                ((hr) this).a(54, 25, (byte) -41);
                ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
                ((hr) this).field_k = nh.field_D[((hr) this).field_c];
                return;
              } else {
                ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
                ((hr) this).field_k = nh.field_D[((hr) this).field_c];
                return;
              }
            }
          } else {
            ((hr) this).field_c = 0;
            if (param0 < 42) {
              ((hr) this).a(54, 25, (byte) -41);
              ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
              ((hr) this).field_k = nh.field_D[((hr) this).field_c];
              return;
            } else {
              ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
              ((hr) this).field_k = nh.field_D[((hr) this).field_c];
              return;
            }
          }
        } else {
          ((hr) this).field_c = 0;
          if (param0 < 42) {
            ((hr) this).a(54, 25, (byte) -41);
            ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
            ((hr) this).field_k = nh.field_D[((hr) this).field_c];
            return;
          } else {
            ((hr) this).field_a = (gd) (Object) mn.field_k[((hr) this).field_c][0];
            ((hr) this).field_k = nh.field_D[((hr) this).field_c];
            return;
          }
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -50) {
          L0: {
            field_d = null;
            ((hr) this).a(-23162, param0);
            if (((hr) this).field_g != null) {
              boolean discarded$4 = ((hr) this).field_g.a(-115);
              break L0;
            } else {
              break L0;
            }
          }
          this.a(-298276720);
          return;
        } else {
          L1: {
            ((hr) this).a(-23162, param0);
            if (((hr) this).field_g != null) {
              boolean discarded$5 = ((hr) this).field_g.a(-115);
              break L1;
            } else {
              break L1;
            }
          }
          this.a(-298276720);
          return;
        }
    }

    final static String b(byte param0) {
        if (param0 < 46) {
            of discarded$0 = hr.a(-107L, 79);
            return mg.field_e.g(1);
        }
        return mg.field_e.g(1);
    }

    final void a(boolean param0, int param1) {
        L0: {
          if (param1 <= -1) {
            break L0;
          } else {
            if (2048 > param1) {
              ((hr) this).field_j = param1;
              break L0;
            } else {
              if (!param0) {
                return;
              } else {
                field_d = null;
                return;
              }
            }
          }
        }
        if (param0) {
          field_d = null;
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1, byte param2) {
        if (!(param0 != -1)) {
            ro.field_ob.field_b = param1;
            ro.field_ob.b((byte) 36);
            ro.field_ob.c(9470337);
            param0 = ro.field_ob.field_e[1];
            param1 = ro.field_ob.field_e[0];
            param0 += 16;
        }
        param1 += 32;
        ((hr) this).field_e[1] = 7 + param0;
        ((hr) this).field_e[0] = 7 + param1;
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        ((hr) this).a(-23162, param4);
        if (!((hr) this).field_l) {
          return true;
        } else {
          var7 = ((hr) this).field_g.a(-95) ? 1 : 0;
          this.a(-298276720);
          if (param5) {
            L0: {
              boolean discarded$1 = ((hr) this).a(85, true, -47, -102, 19, false);
              this.b(param0, param2, (byte) -39);
              if (param3 != -1) {
                ((hr) this).field_j = param3;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((hr) this).field_g.field_c) {
                break L1;
              } else {
                break L1;
              }
            }
            return var7 != 0;
          } else {
            L2: {
              this.b(param0, param2, (byte) -39);
              if (param3 != -1) {
                ((hr) this).field_j = param3;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((hr) this).field_g.field_c) {
                break L3;
              } else {
                break L3;
              }
            }
            return var7 != 0;
          }
        }
    }

    private final void a(byte param0) {
        ((hr) this).field_l = true;
        qb var2 = pg.a(((hr) this).field_f, 176, false, ((hr) this).field_c);
        if (var2 == null) {
            ((hr) this).field_l = false;
            return;
        }
        if (!(var2 != null)) {
            ((hr) this).field_l = false;
            return;
        }
        ((hr) this).field_g.a(-1, var2);
        this.a(-298276720);
    }

    final static of a(long param0, int param1) {
        if (param1 >= -68) {
            return null;
        }
        return (of) (Object) eu.field_e.a((byte) -27, param0);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = 0;
          if (((hr) this).field_f != param1) {
            if (param1 != -1) {
              if (param1 >= 0) {
                if (param1 < 9) {
                  ((hr) this).field_f = param1;
                  var3 = 1;
                  break L0;
                } else {
                  if (((hr) this).field_f == -1) {
                    var3 = 1;
                    ((hr) this).field_f = 0;
                    if (var3 == 0) {
                      if (param0 == -23162) {
                        return;
                      } else {
                        ((hr) this).field_l = true;
                        return;
                      }
                    } else {
                      L1: {
                        this.a((byte) 72);
                        if (param0 == -23162) {
                          break L1;
                        } else {
                          ((hr) this).field_l = true;
                          break L1;
                        }
                      }
                      return;
                    }
                  } else {
                    if (0 > ((hr) this).field_f) {
                      var3 = 1;
                      ((hr) this).field_f = 0;
                      if (var3 == 0) {
                        if (param0 == -23162) {
                          return;
                        } else {
                          ((hr) this).field_l = true;
                          return;
                        }
                      } else {
                        L2: {
                          this.a((byte) 72);
                          if (param0 == -23162) {
                            break L2;
                          } else {
                            ((hr) this).field_l = true;
                            break L2;
                          }
                        }
                        return;
                      }
                    } else {
                      if (9 > ((hr) this).field_f) {
                        if (var3 == 0) {
                          if (param0 == -23162) {
                            return;
                          } else {
                            ((hr) this).field_l = true;
                            return;
                          }
                        } else {
                          this.a((byte) 72);
                          if (param0 != -23162) {
                            ((hr) this).field_l = true;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        var3 = 1;
                        ((hr) this).field_f = 0;
                        if (var3 == 0) {
                          if (param0 == -23162) {
                            return;
                          } else {
                            ((hr) this).field_l = true;
                            return;
                          }
                        } else {
                          L3: {
                            this.a((byte) 72);
                            if (param0 == -23162) {
                              break L3;
                            } else {
                              ((hr) this).field_l = true;
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                if (((hr) this).field_f != -1) {
                  if (0 <= ((hr) this).field_f) {
                    if (9 > ((hr) this).field_f) {
                      if (var3 == 0) {
                        if (param0 != -23162) {
                          ((hr) this).field_l = true;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L4: {
                          this.a((byte) 72);
                          if (param0 == -23162) {
                            break L4;
                          } else {
                            ((hr) this).field_l = true;
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      L5: {
                        var3 = 1;
                        ((hr) this).field_f = 0;
                        if (var3 == 0) {
                          break L5;
                        } else {
                          this.a((byte) 72);
                          break L5;
                        }
                      }
                      L6: {
                        if (param0 == -23162) {
                          break L6;
                        } else {
                          ((hr) this).field_l = true;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      var3 = 1;
                      ((hr) this).field_f = 0;
                      if (var3 == 0) {
                        break L7;
                      } else {
                        this.a((byte) 72);
                        break L7;
                      }
                    }
                    L8: {
                      if (param0 == -23162) {
                        break L8;
                      } else {
                        ((hr) this).field_l = true;
                        break L8;
                      }
                    }
                    return;
                  }
                } else {
                  L9: {
                    var3 = 1;
                    ((hr) this).field_f = 0;
                    if (var3 == 0) {
                      break L9;
                    } else {
                      this.a((byte) 72);
                      break L9;
                    }
                  }
                  L10: {
                    if (param0 == -23162) {
                      break L10;
                    } else {
                      ((hr) this).field_l = true;
                      break L10;
                    }
                  }
                  return;
                }
              }
            } else {
              if (((hr) this).field_f == -1) {
                var3 = 1;
                ((hr) this).field_f = 0;
                if (var3 != 0) {
                  this.a((byte) 72);
                  if (param0 == -23162) {
                    return;
                  } else {
                    ((hr) this).field_l = true;
                    return;
                  }
                } else {
                  L11: {
                    if (param0 == -23162) {
                      break L11;
                    } else {
                      ((hr) this).field_l = true;
                      break L11;
                    }
                  }
                  return;
                }
              } else {
                if (0 <= ((hr) this).field_f) {
                  if (9 > ((hr) this).field_f) {
                    if (var3 == 0) {
                      if (param0 != -23162) {
                        ((hr) this).field_l = true;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L12: {
                        this.a((byte) 72);
                        if (param0 == -23162) {
                          break L12;
                        } else {
                          ((hr) this).field_l = true;
                          break L12;
                        }
                      }
                      return;
                    }
                  } else {
                    L13: {
                      var3 = 1;
                      ((hr) this).field_f = 0;
                      if (var3 == 0) {
                        break L13;
                      } else {
                        this.a((byte) 72);
                        break L13;
                      }
                    }
                    L14: {
                      if (param0 == -23162) {
                        break L14;
                      } else {
                        ((hr) this).field_l = true;
                        break L14;
                      }
                    }
                    return;
                  }
                } else {
                  L15: {
                    var3 = 1;
                    ((hr) this).field_f = 0;
                    if (var3 == 0) {
                      break L15;
                    } else {
                      this.a((byte) 72);
                      break L15;
                    }
                  }
                  L16: {
                    if (param0 == -23162) {
                      break L16;
                    } else {
                      ((hr) this).field_l = true;
                      break L16;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (((hr) this).field_f == -1) {
          var3 = 1;
          ((hr) this).field_f = 0;
          if (var3 == 0) {
            if (param0 == -23162) {
              return;
            } else {
              ((hr) this).field_l = true;
              return;
            }
          } else {
            this.a((byte) 72);
            if (param0 == -23162) {
              return;
            } else {
              ((hr) this).field_l = true;
              return;
            }
          }
        } else {
          if (0 > ((hr) this).field_f) {
            var3 = 1;
            ((hr) this).field_f = 0;
            if (var3 == 0) {
              if (param0 == -23162) {
                return;
              } else {
                ((hr) this).field_l = true;
                return;
              }
            } else {
              this.a((byte) 72);
              if (param0 == -23162) {
                return;
              } else {
                ((hr) this).field_l = true;
                return;
              }
            }
          } else {
            if (9 > ((hr) this).field_f) {
              if (var3 == 0) {
                if (param0 == -23162) {
                  return;
                } else {
                  ((hr) this).field_l = true;
                  return;
                }
              } else {
                this.a((byte) 72);
                if (param0 == -23162) {
                  return;
                } else {
                  ((hr) this).field_l = true;
                  return;
                }
              }
            } else {
              var3 = 1;
              ((hr) this).field_f = 0;
              if (var3 == 0) {
                if (param0 == -23162) {
                  return;
                } else {
                  ((hr) this).field_l = true;
                  return;
                }
              } else {
                this.a((byte) 72);
                if (param0 == -23162) {
                  return;
                } else {
                  ((hr) this).field_l = true;
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var17 = null;
        gd var17_ref = null;
        Object var18 = null;
        gd var18_ref = null;
        gd var19 = null;
        gd var20 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var17 = null;
          var18 = null;
          var5 = param0 ? 1 : 0;
          var6 = 0;
          var7 = 0;
          var8 = 2047 & -((hr) this).field_j + 2048;
          var9 = 1024;
          var10 = 2048;
          var11 = 12;
          var12 = var10 - var10 / var11;
          var13 = 0;
          stackOut_0_0 = ((hr) this).field_k;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          if (stackIn_3_0 & stackIn_3_1 == 0) {
            stackOut_5_0 = 800;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 900;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var14 = stackIn_6_0;
        var15 = -1400;
        if (((hr) this).field_l) {
          tm.a();
          tm.c(param2, param3);
          var17_ref = (gd) (Object) ((hr) this).field_g.a(var5 != 0, true, var6 != 0, (kk) (Object) ((hr) this).field_a);
          var19 = var17_ref;
          var17_ref.b(hk.field_Jb[((hr) this).field_c], hk.field_Jb[((hr) this).field_c], hk.field_Jb[((hr) this).field_c]);
          if (!param1) {
            var19.a(var7, var8, var9, var12, var13, var14, var15);
            return;
          } else {
            np.a(param0, var19);
            var19.a(var7, var8, var9, var12, var13, var14, var15);
            return;
          }
        } else {
          L2: {
            tm.a();
            tm.c(param2, param3);
            var18_ref = (gd) (Object) ((hr) this).field_a.a(var5 != 0, false, var6 != 0);
            var20 = var18_ref;
            var18_ref.b(hk.field_Jb[((hr) this).field_c], hk.field_Jb[((hr) this).field_c], hk.field_Jb[((hr) this).field_c]);
            if (param1) {
              np.a(false, var20);
              break L2;
            } else {
              break L2;
            }
          }
          var20.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
    }

    hr(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.a(true, param2, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4;
            stackOut_3_1 = new StringBuilder().append("hr.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    hr(int param0) {
        this.a(true, 1792, param0);
    }

    private final void a(int param0) {
        int var2 = ((hr) this).field_g.field_i >> 16;
        wp var3 = we.a(var2, true);
        io.a(var3, (byte) -34);
    }

    final void a(int param0, int param1, byte param2) {
        ((hr) this).field_e[0] = param0;
        int var4 = -95 % ((param2 - 34) / 34);
        ((hr) this).field_e[1] = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Become a member to get this expansion and...";
        field_i = 0;
    }
}
