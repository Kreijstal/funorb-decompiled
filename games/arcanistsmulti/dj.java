/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj extends tf {
    private static StringBuilder field_F;
    int field_H;
    private static int field_A;
    private byte[] field_I;
    private int[] field_q;
    private static String[] field_p;
    private int[] field_w;
    private int[] field_v;
    private static int field_D;
    int field_o;
    private static int field_n;
    int field_m;
    int field_C;
    private s[] field_s;
    private static int field_u;
    private static int field_J;
    private static int field_G;
    private static int field_z;
    private int[] field_y;
    private int[] field_r;
    private static int field_B;
    private static int field_E;
    private static int field_t;
    private int[] field_x;

    final int b(String param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        Exception var9 = null;
        int var9_int = 0;
        CharSequence var10 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != null) {
          var2 = -1;
          var3 = 0;
          var4 = 0;
          var5 = param0.length();
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5) {
              return var4;
            } else {
              var7 = param0.charAt(var6);
              if (var7 != 60) {
                L1: {
                  if (var7 != 62) {
                    break L1;
                  } else {
                    if (var2 == -1) {
                      break L1;
                    } else {
                      var8 = param0.substring(var2 + 1, var6).toLowerCase();
                      var2 = -1;
                      if (!var8.equals((Object) (Object) "lt")) {
                        if (!var8.equals((Object) (Object) "gt")) {
                          if (!var8.equals((Object) (Object) "nbsp")) {
                            if (!var8.equals((Object) (Object) "shy")) {
                              if (!var8.equals((Object) (Object) "times")) {
                                if (!var8.equals((Object) (Object) "euro")) {
                                  if (!var8.equals((Object) (Object) "copy")) {
                                    if (!var8.equals((Object) (Object) "reg")) {
                                      if (var8.startsWith("img=")) {
                                        try {
                                          L2: {
                                            var10 = (CharSequence) (Object) var8.substring(4);
                                            var9_int = dc.a(var10, 126);
                                            var4 = var4 + ((dj) this).field_s[var9_int].field_g;
                                            var3 = 0;
                                            var6++;
                                            break L2;
                                          }
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L3: {
                                            var9 = (Exception) (Object) decompiledCaughtException;
                                            var6++;
                                            break L3;
                                          }
                                        }
                                        continue L0;
                                      } else {
                                        var6++;
                                        continue L0;
                                      }
                                    } else {
                                      var7 = 174;
                                      break L1;
                                    }
                                  } else {
                                    var7 = 169;
                                    break L1;
                                  }
                                } else {
                                  var7 = 8364;
                                  break L1;
                                }
                              } else {
                                var7 = 215;
                                break L1;
                              }
                            } else {
                              var7 = 173;
                              break L1;
                            }
                          } else {
                            var7 = 160;
                            break L1;
                          }
                        } else {
                          var7 = 62;
                          break L1;
                        }
                      } else {
                        var7 = 60;
                        break L1;
                      }
                    }
                  }
                }
                if (var2 == -1) {
                  L4: {
                    var7 = (char)(fe.a((byte) 124, (char) var7) & 255);
                    var4 = var4 + ((dj) this).field_v[var7];
                    if (((dj) this).field_I == null) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        break L4;
                      } else {
                        var4 = var4 + ((dj) this).field_I[(var3 << 8) + var7];
                        break L4;
                      }
                    }
                  }
                  var3 = var7;
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var2 = var6;
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - ((dj) this).b(param0) / 2, param2);
    }

    final void a(s[] param0, int[] param1) {
        if (param1 != null) {
            if (param1.length != param0.length) {
                throw new IllegalArgumentException();
            }
        }
        ((dj) this).field_s = param0;
        ((dj) this).field_x = param1;
    }

    private final void b(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (var3 <= 0) {
                break L1;
              } else {
                field_B = (param1 - ((dj) this).b(param0) << 8) / var3;
                break L1;
              }
            }
            return;
          } else {
            var7 = param0.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var4 == 0) {
                  if (var7 == 32) {
                    var3++;
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var4 = 0;
                var6++;
                continue L0;
              }
            } else {
              var4 = 1;
              var6++;
              continue L0;
            }
          }
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param0 != null) {
          L0: {
            this.a(param5, param6, param7);
            if (param10 != 0) {
              break L0;
            } else {
              param10 = ((dj) this).field_H;
              break L0;
            }
          }
          L1: {
            var12 = new int[]{param3};
            if (param4 >= ((dj) this).field_C + ((dj) this).field_m + param10) {
              break L1;
            } else {
              if (param4 >= param10 + param10) {
                break L1;
              } else {
                var12 = null;
                break L1;
              }
            }
          }
          L2: {
            var13 = ((dj) this).a(param0, var12, field_p);
            if (param9 != 3) {
              break L2;
            } else {
              if (var13 != 1) {
                break L2;
              } else {
                param9 = 1;
                break L2;
              }
            }
          }
          L3: {
            if (param9 != 0) {
              if (param9 != 1) {
                if (param9 != 2) {
                  L4: {
                    var15 = (param4 - ((dj) this).field_C - ((dj) this).field_m - (var13 - 1) * param10) / (var13 + 1);
                    if (var15 >= 0) {
                      break L4;
                    } else {
                      var15 = 0;
                      break L4;
                    }
                  }
                  var14 = param2 + ((dj) this).field_C + var15;
                  param10 = param10 + var15;
                  break L3;
                } else {
                  var14 = param2 + param4 - ((dj) this).field_m - (var13 - 1) * param10;
                  break L3;
                }
              } else {
                var14 = param2 + ((dj) this).field_C + (param4 - ((dj) this).field_C - ((dj) this).field_m - (var13 - 1) * param10) / 2;
                break L3;
              }
            } else {
              var14 = param2 + ((dj) this).field_C;
              break L3;
            }
          }
          var15 = 0;
          L5: while (true) {
            if (var15 >= var13) {
              return var13;
            } else {
              if (param8 != 0) {
                if (param8 != 1) {
                  if (param8 != 2) {
                    L6: {
                      if (var15 != var13 - 1) {
                        this.b(field_p[var15], param3);
                        this.b(field_p[var15], param1, var14);
                        field_B = 0;
                        break L6;
                      } else {
                        this.b(field_p[var15], param1, var14);
                        break L6;
                      }
                    }
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  } else {
                    this.b(field_p[var15], param1 + param3 - ((dj) this).b(field_p[var15]), var14);
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  }
                } else {
                  this.b(field_p[var15], param1 + (param3 - ((dj) this).b(field_p[var15])) / 2, var14);
                  var14 = var14 + param10;
                  var15++;
                  continue L5;
                }
              } else {
                this.b(field_p[var15], param1, var14);
                var14 = var14 + param10;
                var15++;
                continue L5;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = ((dj) this).field_H;
        }
        int var4 = ((dj) this).a(param0, new int[1], field_p);
        int var5 = (var4 - 1) * param2;
        return ((dj) this).field_C + var5 + ((dj) this).field_m;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((dj) this).b(param0) / 2, param2);
    }

    private final void c(String param0) {
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.startsWith("col=")) {
                if (!param0.equals((Object) (Object) "/col")) {
                  if (!param0.startsWith("trans=")) {
                    if (!param0.equals((Object) (Object) "/trans")) {
                      if (!param0.startsWith("str=")) {
                        if (!param0.equals((Object) (Object) "str")) {
                          if (!param0.equals((Object) (Object) "/str")) {
                            if (!param0.startsWith("u=")) {
                              if (!param0.equals((Object) (Object) "u")) {
                                if (!param0.equals((Object) (Object) "/u")) {
                                  if (!param0.startsWith("shad=")) {
                                    if (!param0.equals((Object) (Object) "shad")) {
                                      if (!param0.equals((Object) (Object) "/shad")) {
                                        if (!param0.equals((Object) (Object) "br")) {
                                          break L1;
                                        } else {
                                          this.a(field_J, field_D, field_E);
                                          break L1;
                                        }
                                      } else {
                                        field_t = field_D;
                                        break L1;
                                      }
                                    } else {
                                      field_t = 0;
                                      break L1;
                                    }
                                  } else {
                                    var7 = (CharSequence) (Object) param0.substring(5);
                                    field_t = rc.a((byte) 92, var7, 16);
                                    break L1;
                                  }
                                } else {
                                  field_z = -1;
                                  break L1;
                                }
                              } else {
                                field_z = 0;
                                break L1;
                              }
                            } else {
                              var6 = (CharSequence) (Object) param0.substring(2);
                              field_z = rc.a((byte) 122, var6, 16);
                              break L1;
                            }
                          } else {
                            field_n = -1;
                            break L1;
                          }
                        } else {
                          field_n = 8388608;
                          break L1;
                        }
                      } else {
                        var5 = (CharSequence) (Object) param0.substring(4);
                        field_n = rc.a((byte) -73, var5, 16);
                        break L1;
                      }
                    } else {
                      field_G = field_E;
                      break L1;
                    }
                  } else {
                    var4 = (CharSequence) (Object) param0.substring(6);
                    field_G = dc.a(var4, 126);
                    break L1;
                  }
                } else {
                  field_A = field_J;
                  break L1;
                }
              } else {
                var3 = (CharSequence) (Object) param0.substring(4);
                field_A = rc.a((byte) 120, var3, 16);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    final int a(String param0, int[] param1, String[] param2) {
        int var4 = 0;
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
        String var15 = null;
        Exception var16 = null;
        int var16_int = 0;
        Object var17 = null;
        CharSequence var18 = null;
        int stackIn_66_0 = 0;
        int[] stackIn_66_1 = null;
        int stackIn_67_0 = 0;
        int[] stackIn_67_1 = null;
        int stackIn_68_0 = 0;
        int[] stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int[] stackOut_65_1 = null;
        int stackOut_67_0 = 0;
        int[] stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_66_0 = 0;
        int[] stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        var17 = null;
        if (param0 != null) {
          StringBuilder discarded$5 = qj.a(0, field_F, ' ', false);
          var4 = 0;
          var5 = 0;
          var6 = -1;
          var7 = 0;
          var8 = 0;
          var9 = -1;
          var10 = 0;
          var11 = 0;
          var12 = param0.length();
          var13 = 0;
          L0: while (true) {
            if (var13 >= var12) {
              L1: {
                if (field_F.length() <= var5) {
                  break L1;
                } else {
                  param2[var11] = field_F.toString().substring(var5, field_F.length());
                  var11++;
                  break L1;
                }
              }
              return var11;
            } else {
              var14 = param0.charAt(var13);
              if (var14 != 60) {
                L2: {
                  if (var14 != 62) {
                    break L2;
                  } else {
                    if (var9 == -1) {
                      break L2;
                    } else {
                      L3: {
                        var15 = param0.substring(var9 + 1, var13).toLowerCase();
                        var9 = -1;
                        StringBuilder discarded$6 = field_F.append('<');
                        StringBuilder discarded$7 = field_F.append(var15);
                        StringBuilder discarded$8 = field_F.append('>');
                        if (!var15.equals((Object) (Object) "br")) {
                          if (!var15.equals((Object) (Object) "lt")) {
                            if (!var15.equals((Object) (Object) "gt")) {
                              if (!var15.equals((Object) (Object) "nbsp")) {
                                if (!var15.equals((Object) (Object) "shy")) {
                                  if (!var15.equals((Object) (Object) "times")) {
                                    if (!var15.equals((Object) (Object) "euro")) {
                                      if (!var15.equals((Object) (Object) "copy")) {
                                        if (!var15.equals((Object) (Object) "reg")) {
                                          if (!var15.startsWith("img=")) {
                                            break L3;
                                          } else {
                                            try {
                                              L4: {
                                                var18 = (CharSequence) (Object) var15.substring(4);
                                                var16_int = dc.a(var18, 126);
                                                var4 = var4 + ((dj) this).field_s[var16_int].field_g;
                                                var10 = 0;
                                                break L4;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                                              decompiledCaughtException = decompiledCaughtParameter0;
                                              L5: {
                                                var16 = (Exception) (Object) decompiledCaughtException;
                                                break L5;
                                              }
                                            }
                                            break L3;
                                          }
                                        } else {
                                          L6: {
                                            var4 = var4 + ((dj) this).a('®');
                                            if (((dj) this).field_I == null) {
                                              break L6;
                                            } else {
                                              if (var10 == 0) {
                                                break L6;
                                              } else {
                                                var4 = var4 + ((dj) this).field_I[(var10 << 8) + 174];
                                                break L6;
                                              }
                                            }
                                          }
                                          var10 = 174;
                                          break L3;
                                        }
                                      } else {
                                        L7: {
                                          var4 = var4 + ((dj) this).a('©');
                                          if (((dj) this).field_I == null) {
                                            break L7;
                                          } else {
                                            if (var10 == 0) {
                                              break L7;
                                            } else {
                                              var4 = var4 + ((dj) this).field_I[(var10 << 8) + 169];
                                              break L7;
                                            }
                                          }
                                        }
                                        var10 = 169;
                                        break L3;
                                      }
                                    } else {
                                      L8: {
                                        var4 = var4 + ((dj) this).a('€');
                                        if (((dj) this).field_I == null) {
                                          break L8;
                                        } else {
                                          if (var10 == 0) {
                                            break L8;
                                          } else {
                                            var4 = var4 + ((dj) this).field_I[(var10 << 8) + 128];
                                            break L8;
                                          }
                                        }
                                      }
                                      var10 = 8364;
                                      break L3;
                                    }
                                  } else {
                                    L9: {
                                      var4 = var4 + ((dj) this).a('×');
                                      if (((dj) this).field_I == null) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L9;
                                        } else {
                                          var4 = var4 + ((dj) this).field_I[(var10 << 8) + 215];
                                          break L9;
                                        }
                                      }
                                    }
                                    var10 = 215;
                                    break L3;
                                  }
                                } else {
                                  L10: {
                                    var4 = var4 + ((dj) this).a('­');
                                    if (((dj) this).field_I == null) {
                                      break L10;
                                    } else {
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        var4 = var4 + ((dj) this).field_I[(var10 << 8) + 173];
                                        break L10;
                                      }
                                    }
                                  }
                                  var10 = 173;
                                  break L3;
                                }
                              } else {
                                L11: {
                                  var4 = var4 + ((dj) this).a(' ');
                                  if (((dj) this).field_I == null) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      break L11;
                                    } else {
                                      var4 = var4 + ((dj) this).field_I[(var10 << 8) + 160];
                                      break L11;
                                    }
                                  }
                                }
                                var10 = 160;
                                break L3;
                              }
                            } else {
                              L12: {
                                var4 = var4 + ((dj) this).a('>');
                                if (((dj) this).field_I == null) {
                                  break L12;
                                } else {
                                  if (var10 == 0) {
                                    break L12;
                                  } else {
                                    var4 = var4 + ((dj) this).field_I[(var10 << 8) + 62];
                                    break L12;
                                  }
                                }
                              }
                              var10 = 62;
                              break L3;
                            }
                          } else {
                            L13: {
                              var4 = var4 + ((dj) this).a('<');
                              if (((dj) this).field_I == null) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 + ((dj) this).field_I[(var10 << 8) + 60];
                                  break L13;
                                }
                              }
                            }
                            var10 = 60;
                            break L3;
                          }
                        } else {
                          param2[var11] = field_F.toString().substring(var5, field_F.length());
                          var11++;
                          var5 = field_F.length();
                          var4 = 0;
                          var6 = -1;
                          var10 = 0;
                          break L3;
                        }
                      }
                      var14 = 0;
                      break L2;
                    }
                  }
                }
                if (var9 == -1) {
                  L14: {
                    if (var14 == 0) {
                      break L14;
                    } else {
                      L15: {
                        StringBuilder discarded$9 = field_F.append((char) var14);
                        var14 = (char)(fe.a((byte) 91, (char) var14) & 255);
                        var4 = var4 + ((dj) this).field_v[var14];
                        if (((dj) this).field_I == null) {
                          break L15;
                        } else {
                          if (var10 == 0) {
                            break L15;
                          } else {
                            var4 = var4 + ((dj) this).field_I[(var10 << 8) + var14];
                            break L15;
                          }
                        }
                      }
                      var10 = var14;
                      break L14;
                    }
                  }
                  L16: {
                    if (var14 != 32) {
                      break L16;
                    } else {
                      var6 = field_F.length();
                      var7 = var4;
                      var8 = 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (param1 == null) {
                      break L17;
                    } else {
                      L18: {
                        stackOut_65_0 = var4;
                        stackOut_65_1 = (int[]) param1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (var11 >= param1.length) {
                          stackOut_67_0 = stackIn_67_0;
                          stackOut_67_1 = (int[]) (Object) stackIn_67_1;
                          stackOut_67_2 = param1.length - 1;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L18;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = (int[]) (Object) stackIn_66_1;
                          stackOut_66_2 = var11;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          break L18;
                        }
                      }
                      if (stackIn_68_0 <= stackIn_68_1[stackIn_68_2]) {
                        break L17;
                      } else {
                        if (var6 < 0) {
                          break L17;
                        } else {
                          param2[var11] = field_F.toString().substring(var5, var6 - var8);
                          var11++;
                          var5 = var6;
                          var6 = -1;
                          var4 = var4 - var7;
                          var10 = 0;
                          break L17;
                        }
                      }
                    }
                  }
                  if (var14 == 45) {
                    var6 = field_F.length();
                    var7 = var4;
                    var8 = 0;
                    var13++;
                    continue L0;
                  } else {
                    var13++;
                    continue L0;
                  }
                } else {
                  var13++;
                  continue L0;
                }
              } else {
                var9 = var13;
                var13++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static String a(dj param0, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0.b(param1) > param2) {
          var3 = param0.b("...");
          var4 = param2 - var3;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (var6 < param1.length()) {
              var7 = param0.a(param1.charAt(var6));
              if (var5 + var7 <= var4) {
                var5 = var5 + var7;
                var6++;
                continue L0;
              } else {
                return param1.substring(0, var6 - 1) + "...";
              }
            } else {
              return null;
            }
          }
        } else {
          return param1;
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1, param2);
    }

    final int a(char param0) {
        return ((dj) this).field_v[fe.a((byte) 74, param0) & 255];
    }

    private final void a(int param0, int param1) {
        field_n = -1;
        field_z = -1;
        field_D = param1;
        field_t = param1;
        field_J = param0;
        field_A = param0;
        field_E = 256;
        field_G = 256;
        field_B = 0;
        field_u = 0;
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1, param2);
    }

    private final void a(int param0, int param1, int param2) {
        field_n = -1;
        field_z = -1;
        field_D = param1;
        field_t = param1;
        field_J = param0;
        field_A = param0;
        field_E = param2;
        field_G = param2;
        field_B = 0;
        field_u = 0;
    }

    final static String a(String param0) {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        var1 = param0.length();
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= var1) {
            var3 = new StringBuilder(var1 + var2);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var1) {
                return var3.toString();
              } else {
                var5 = param0.charAt(var4);
                if (var5 != 60) {
                  if (var5 != 62) {
                    StringBuilder discarded$3 = var3.append((char) var5);
                    var4++;
                    continue L1;
                  } else {
                    StringBuilder discarded$4 = var3.append("<gt>");
                    var4++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$5 = var3.append("<lt>");
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = param0.charAt(var3_int);
            if (var4 != 60) {
              if (var4 != 62) {
                var3_int++;
                continue L0;
              } else {
                var2 += 3;
                var3_int++;
                continue L0;
              }
            } else {
              var2 += 3;
              var3_int++;
              continue L0;
            }
          }
        }
    }

    private final void b(String param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        Exception var10_ref_Exception = null;
        int var10 = 0;
        int var11 = 0;
        s var11_ref_s = null;
        int var12 = 0;
        CharSequence var13 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        param2 = param2 - ((dj) this).field_H;
        var4 = -1;
        var5 = 0;
        var6 = param0.length();
        var7 = 0;
        L0: while (true) {
          if (var7 >= var6) {
            return;
          } else {
            var8 = param0.charAt(var7);
            if (var8 != 60) {
              L1: {
                if (var8 != 62) {
                  break L1;
                } else {
                  if (var4 == -1) {
                    break L1;
                  } else {
                    var9_ref_String = param0.substring(var4 + 1, var7).toLowerCase();
                    var4 = -1;
                    if (!var9_ref_String.equals((Object) (Object) "lt")) {
                      if (!var9_ref_String.equals((Object) (Object) "gt")) {
                        if (!var9_ref_String.equals((Object) (Object) "nbsp")) {
                          if (!var9_ref_String.equals((Object) (Object) "shy")) {
                            if (!var9_ref_String.equals((Object) (Object) "times")) {
                              if (!var9_ref_String.equals((Object) (Object) "euro")) {
                                if (!var9_ref_String.equals((Object) (Object) "copy")) {
                                  if (!var9_ref_String.equals((Object) (Object) "reg")) {
                                    if (!var9_ref_String.startsWith("img=")) {
                                      this.c(var9_ref_String);
                                      var7++;
                                      continue L0;
                                    } else {
                                      try {
                                        L2: {
                                          L3: {
                                            var13 = (CharSequence) (Object) var9_ref_String.substring(4);
                                            var10 = dc.a(var13, 127);
                                            var11_ref_s = ((dj) this).field_s[var10];
                                            if (((dj) this).field_x == null) {
                                              stackOut_25_0 = var11_ref_s.field_k;
                                              stackIn_26_0 = stackOut_25_0;
                                              break L3;
                                            } else {
                                              stackOut_24_0 = ((dj) this).field_x[var10];
                                              stackIn_26_0 = stackOut_24_0;
                                              break L3;
                                            }
                                          }
                                          L4: {
                                            var12 = stackIn_26_0;
                                            if (field_G != 256) {
                                              var11_ref_s.a(param1, param2 + ((dj) this).field_H - var12, field_G);
                                              break L4;
                                            } else {
                                              var11_ref_s.a(param1, param2 + ((dj) this).field_H - var12);
                                              break L4;
                                            }
                                          }
                                          param1 = param1 + var11_ref_s.field_g;
                                          var5 = 0;
                                          var7++;
                                          break L2;
                                        }
                                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                                        decompiledCaughtException = decompiledCaughtParameter0;
                                        L5: {
                                          var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                          var7++;
                                          break L5;
                                        }
                                      }
                                      continue L0;
                                    }
                                  } else {
                                    var8 = 174;
                                    break L1;
                                  }
                                } else {
                                  var8 = 169;
                                  break L1;
                                }
                              } else {
                                var8 = 8364;
                                break L1;
                              }
                            } else {
                              var8 = 215;
                              break L1;
                            }
                          } else {
                            var8 = 173;
                            break L1;
                          }
                        } else {
                          var8 = 160;
                          break L1;
                        }
                      } else {
                        var8 = 62;
                        break L1;
                      }
                    } else {
                      var8 = 60;
                      break L1;
                    }
                  }
                }
              }
              if (var4 == -1) {
                L6: {
                  var8 = (char)(fe.a((byte) 99, (char) var8) & 255);
                  if (((dj) this).field_I == null) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      param1 = param1 + ((dj) this).field_I[(var5 << 8) + var8];
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = ((dj) this).field_y[var8];
                  var10 = ((dj) this).field_w[var8];
                  var11 = param1;
                  if (var8 == 32) {
                    if (field_B <= 0) {
                      break L7;
                    } else {
                      field_u = field_u + field_B;
                      param1 = param1 + (field_u >> 8);
                      field_u = field_u & 255;
                      break L7;
                    }
                  } else {
                    if (field_G != 256) {
                      L8: {
                        if (field_t == -1) {
                          break L8;
                        } else {
                          ((dj) this).a(var8, param1 + ((dj) this).field_q[var8] + 1, param2 + ((dj) this).field_r[var8] + 1, var9, var10, field_t, field_G, true);
                          break L8;
                        }
                      }
                      ((dj) this).a(var8, param1 + ((dj) this).field_q[var8], param2 + ((dj) this).field_r[var8], var9, var10, field_A, field_G, false);
                      break L7;
                    } else {
                      L9: {
                        if (field_t == -1) {
                          break L9;
                        } else {
                          ((dj) this).a(var8, param1 + ((dj) this).field_q[var8] + 1, param2 + ((dj) this).field_r[var8] + 1, var9, var10, field_t, true);
                          break L9;
                        }
                      }
                      ((dj) this).a(var8, param1 + ((dj) this).field_q[var8], param2 + ((dj) this).field_r[var8], var9, var10, field_A, false);
                      break L7;
                    }
                  }
                }
                L10: {
                  param1 = param1 + ((dj) this).field_v[var8];
                  if (field_n == -1) {
                    break L10;
                  } else {
                    de.f(var11, param2 + (int)((double)((dj) this).field_H * 0.7), param1 - var11, field_n);
                    break L10;
                  }
                }
                L11: {
                  if (field_z == -1) {
                    break L11;
                  } else {
                    de.f(var11, param2 + ((dj) this).field_H + 1, param1 - var11, field_z);
                    break L11;
                  }
                }
                var5 = var8;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            } else {
              var4 = var7;
              var7++;
              continue L0;
            }
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    public static void a() {
        field_F = null;
        field_p = null;
    }

    final int c(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = ((dj) this).a(param0, new int[1], field_p);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var3) {
            return var4;
          } else {
            var6 = ((dj) this).b(field_p[var5]);
            if (var6 > var4) {
              var4 = var6;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var7 = param2[param5];
          var8 = var7 + param4[param5];
          var9 = param2[param6];
          var10 = var9 + param4[param6];
          var11 = var7;
          if (var9 <= var7) {
            break L0;
          } else {
            var11 = var9;
            break L0;
          }
        }
        L1: {
          var12 = var8;
          if (var10 >= var8) {
            break L1;
          } else {
            var12 = var10;
            break L1;
          }
        }
        L2: {
          var13 = param3[param5];
          if (param3[param6] >= var13) {
            break L2;
          } else {
            var13 = param3[param6];
            break L2;
          }
        }
        var14 = param1[param5];
        var15 = param0[param6];
        var16 = var11 - var7;
        var17 = var11 - var9;
        var18 = var11;
        L3: while (true) {
          if (var18 >= var12) {
            return -var13;
          } else {
            int incrementValue$12 = var16;
            var16++;
            int incrementValue$13 = var17;
            var17++;
            var19 = var14[incrementValue$12] + var15[incrementValue$13];
            if (var19 < var13) {
              var13 = var19;
              var18++;
              continue L3;
            } else {
              var18++;
              continue L3;
            }
          }
        }
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - ((dj) this).b(param0), param2);
    }

    final int a(String param0, int param1) {
        return ((dj) this).a(param0, new int[1], field_p);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return ((dj) this).a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    private final void a(byte[] param0) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        byte[][] var5 = null;
        int var6_int = 0;
        byte[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        byte[][] var11 = null;
        byte[][] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        byte[][] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        byte[][] var23 = null;
        byte[][] var24 = null;
        int[] var25 = null;
        L0: {
          ((dj) this).field_v = new int[256];
          if (param0.length != 257) {
            var2 = 0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 256) {
                var22 = new int[256];
                var18 = var22;
                var14 = var18;
                var10 = var14;
                var3 = var10;
                var25 = new int[256];
                var21 = var25;
                var17 = var21;
                var13 = var17;
                var4 = var13;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= 256) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= 256) {
                        var23 = new byte[256][];
                        var19 = var23;
                        var15 = var19;
                        var11 = var15;
                        var5 = var11;
                        var6_int = 0;
                        L4: while (true) {
                          if (var6_int >= 256) {
                            var24 = new byte[256][];
                            var20 = var24;
                            var16 = var20;
                            var12 = var16;
                            var6 = var12;
                            var7 = 0;
                            L5: while (true) {
                              if (var7 >= 256) {
                                ((dj) this).field_I = new byte[65536];
                                var7 = 0;
                                L6: while (true) {
                                  if (var7 >= 256) {
                                    ((dj) this).field_H = var25[32] + var22[32];
                                    break L0;
                                  } else {
                                    if (var7 != 32) {
                                      if (var7 != 160) {
                                        var8 = 0;
                                        L7: while (true) {
                                          if (var8 < 256) {
                                            if (var8 != 32) {
                                              if (var8 != 160) {
                                                ((dj) this).field_I[(var7 << 8) + var8] = (byte)dj.a(var23, var24, var25, ((dj) this).field_v, var22, var7, var8);
                                                var8++;
                                                continue L7;
                                              } else {
                                                var8++;
                                                continue L7;
                                              }
                                            } else {
                                              var8++;
                                              continue L7;
                                            }
                                          } else {
                                            var7++;
                                            continue L6;
                                          }
                                        }
                                      } else {
                                        var7++;
                                        continue L6;
                                      }
                                    } else {
                                      var7++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                var6[var7] = new byte[var22[var7]];
                                var8 = 0;
                                var9 = 0;
                                L8: while (true) {
                                  if (var9 >= var24[var7].length) {
                                    var7++;
                                    continue L5;
                                  } else {
                                    int incrementValue$5 = var2;
                                    var2++;
                                    var8 = (byte)(var8 + param0[incrementValue$5]);
                                    var24[var7][var9] = (byte)var8;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            var5[var6_int] = new byte[var22[var6_int]];
                            var7 = 0;
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= var23[var6_int].length) {
                                var6_int++;
                                continue L4;
                              } else {
                                int incrementValue$6 = var2;
                                var2++;
                                var7 = (byte)(var7 + param0[incrementValue$6]);
                                var23[var6_int][var8] = (byte)var7;
                                var8++;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        int incrementValue$7 = var2;
                        var2++;
                        var4[var5_int] = param0[incrementValue$7] & 255;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    int incrementValue$8 = var2;
                    var2++;
                    var3[var5_int] = param0[incrementValue$8] & 255;
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                int incrementValue$9 = var2;
                var2++;
                ((dj) this).field_v[var3_int] = param0[incrementValue$9] & 255;
                var3_int++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L10: while (true) {
              if (var2 >= ((dj) this).field_v.length) {
                ((dj) this).field_H = param0[256] & 255;
                break L0;
              } else {
                ((dj) this).field_v[var2] = param0[var2] & 255;
                var2++;
                continue L10;
              }
            }
          }
        }
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((dj) this).b(param0), param2);
    }

    dj(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ((dj) this).field_H = 0;
        ((dj) this).field_q = param1;
        ((dj) this).field_r = param2;
        ((dj) this).field_y = param3;
        ((dj) this).field_w = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            ((dj) this).field_C = ((dj) this).field_H - var6;
            ((dj) this).field_m = var7 - ((dj) this).field_H;
            ((dj) this).field_o = ((dj) this).field_H - ((dj) this).field_r[88];
            return;
          } else {
            L1: {
              if (((dj) this).field_r[var8] >= var6) {
                break L1;
              } else {
                if (((dj) this).field_w[var8] == 0) {
                  break L1;
                } else {
                  var6 = ((dj) this).field_r[var8];
                  break L1;
                }
              }
            }
            if (((dj) this).field_r[var8] + ((dj) this).field_w[var8] > var7) {
              var7 = ((dj) this).field_r[var8] + ((dj) this).field_w[var8];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final void a(char param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 != 32) {
            param2 = param2 - ((dj) this).field_H;
            var5 = fe.a((byte) 24, param0) & 255;
            ((dj) this).a(var5, param1 + ((dj) this).field_q[var5], param2 + ((dj) this).field_r[var5], ((dj) this).field_y[var5], ((dj) this).field_w[var5], param3, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new StringBuilder(100);
        field_A = 0;
        field_p = new String[100];
        field_u = 0;
        field_G = 256;
        field_E = 256;
        field_t = -1;
        field_J = 0;
        field_D = -1;
        field_n = -1;
        field_B = 0;
        field_z = -1;
    }
}
