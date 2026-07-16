/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class b {
    static int field_a;
    private be field_c;
    private int field_f;
    private ug field_e;
    static String field_b;
    static String field_d;
    private int field_g;

    private final void a(int param0, ib param1) {
        if (param0 > 62) {
          if (param1 == null) {
            return;
          } else {
            param1.a(false);
            param1.a(1);
            ((b) this).field_g = ((b) this).field_g + param1.field_n;
            return;
          }
        } else {
          this.a((Object) null, -109, (byte) 8, -120L);
          if (param1 == null) {
            return;
          } else {
            param1.a(false);
            param1.a(1);
            ((b) this).field_g = ((b) this).field_g + param1.field_n;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static Vector a(int param0, InputStream param1, String[] param2) throws IOException {
        DataInputStream var3 = null;
        int var4 = 0;
        int var5 = 0;
        Vector var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        f[][] var12 = null;
        f var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        DataInputStream var17 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        var16 = CrazyCrystals.field_B;
        var17 = new DataInputStream(param1);
        var3 = var17;
        var4 = var3.readByte();
        var5 = var3.readShort();
        var6 = new Vector();
        var7 = param0;
        L0: while (true) {
          if (var5 > var7) {
            var8 = sb.a(1, var3);
            var9 = var3.readUnsignedByte();
            var10 = var3.readInt();
            var11 = var3.readInt();
            var12 = new f[var11 - -2][2 + var10];
            var13 = ff.a(0, 0, 1, var4, var3);
            var14 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var14 >= 2 + var10) {
                    break L3;
                  } else {
                    var12[0][var14] = var13;
                    var14++;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var14 = 1;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (1 + var11 <= var14) {
                      break L6;
                    } else {
                      var12[var14][0] = var13;
                      stackOut_10_0 = 1;
                      stackIn_19_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var16 != 0) {
                        break L5;
                      } else {
                        var15 = stackIn_11_0;
                        L7: while (true) {
                          L8: {
                            if (var10 + 1 <= var15) {
                              var12[var14][var10 - -1] = var13;
                              var14++;
                              break L8;
                            } else {
                              var12[var14][var15] = ff.a(var4, var15, oe.a(param0, 1), var14, var17);
                              var15++;
                              if (var16 == 0) {
                                continue L7;
                              } else {
                                var12[var14][var10 - -1] = var13;
                                var14++;
                                break L8;
                              }
                            }
                          }
                          if (var16 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L5;
                }
                var14 = stackIn_19_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          if (var14 >= 2 + var10) {
                            break L13;
                          } else {
                            var12[1 + var11][var14] = var13;
                            var14++;
                            if (var16 != 0) {
                              break L12;
                            } else {
                              if (var16 == 0) {
                                continue L9;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        if (param2 != null) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                      L14: {
                        if (-1 != (var8.length() ^ -1)) {
                          break L14;
                        } else {
                          var6.addElement((Object) null);
                          if (var16 == 0) {
                            break L10;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (ul.field_g != 0) {
                          break L15;
                        } else {
                          if (!param2[var7].equals((Object) (Object) var8)) {
                            throw new IllegalStateException(Integer.toString(var7));
                          } else {
                            break L15;
                          }
                        }
                      }
                      var8 = param2[var7];
                      if ((go.field_l.a(var8) ^ -1) < -147) {
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var6.addElement((Object) (Object) new kb(var12, var8, var9));
                    break L10;
                  }
                  var7++;
                  continue L0;
                }
              }
            }
          } else {
            return var6;
          }
        }
    }

    final Object a(int param0, long param1) {
        ib var4 = null;
        Object var5 = null;
        qd var6 = null;
        var4 = (ib) (Object) ((b) this).field_e.a(param1, -114);
        if (var4 != null) {
          if (param0 >= 83) {
            var5 = var4.f(-18088);
            if (var5 == null) {
              var4.a(false);
              var4.a(1);
              ((b) this).field_g = ((b) this).field_g + var4.field_n;
              return null;
            } else {
              if (!var4.h(-964)) {
                ((b) this).field_c.a((byte) 8, (ij) (Object) var4);
                var4.field_k = 0L;
                if (CrazyCrystals.field_B != 0) {
                  var6 = new qd(var5, var4.field_n);
                  ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                  ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                  ((ib) (Object) var6).field_k = 0L;
                  var4.a(false);
                  var4.a(1);
                  return var5;
                } else {
                  return var5;
                }
              } else {
                var6 = new qd(var5, var4.field_n);
                ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                ((ib) (Object) var6).field_k = 0L;
                var4.a(false);
                var4.a(1);
                return var5;
              }
            }
          } else {
            field_b = null;
            var5 = var4.f(-18088);
            if (var5 == null) {
              var4.a(false);
              var4.a(1);
              ((b) this).field_g = ((b) this).field_g + var4.field_n;
              return null;
            } else {
              if (!var4.h(-964)) {
                ((b) this).field_c.a((byte) 8, (ij) (Object) var4);
                var4.field_k = 0L;
                if (CrazyCrystals.field_B == 0) {
                  return var5;
                } else {
                  var6 = new qd(var5, var4.field_n);
                  ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                  ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                  ((ib) (Object) var6).field_k = 0L;
                  var4.a(false);
                  var4.a(1);
                  return var5;
                }
              } else {
                var6 = new qd(var5, var4.field_n);
                ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                ((ib) (Object) var6).field_k = 0L;
                var4.a(false);
                var4.a(1);
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        qd var6 = null;
        ib var6_ref = null;
        int var7 = 0;
        ib var8 = null;
        var7 = CrazyCrystals.field_B;
        if (param2 >= 46) {
          if (param1 > ((b) this).field_f) {
            throw new IllegalStateException();
          } else {
            this.a(param3, -70);
            ((b) this).field_g = ((b) this).field_g - param1;
            L0: while (true) {
              L1: {
                if (((b) this).field_g >= 0) {
                  break L1;
                } else {
                  var8 = (ib) (Object) ((b) this).field_c.a(30244);
                  this.a(66, var8);
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              var6 = new qd(param0, param1);
              ((b) this).field_e.a(param3, (byte) 42, (jb) (Object) var6);
              ((b) this).field_c.a((byte) 119, (ij) (Object) var6);
              ((ib) (Object) var6).field_k = 0L;
              return;
            }
          }
        } else {
          field_d = null;
          if (param1 > ((b) this).field_f) {
            throw new IllegalStateException();
          } else {
            this.a(param3, -70);
            ((b) this).field_g = ((b) this).field_g - param1;
            L2: while (true) {
              L3: {
                if (((b) this).field_g >= 0) {
                  break L3;
                } else {
                  var6_ref = (ib) (Object) ((b) this).field_c.a(30244);
                  this.a(66, var6_ref);
                  if (var7 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = new qd(param0, param1);
              ((b) this).field_e.a(param3, (byte) 42, (jb) (Object) var6);
              ((b) this).field_c.a((byte) 119, (ij) (Object) var6);
              ((ib) (Object) var6).field_k = 0L;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = CrazyCrystals.field_B;
        if (param10 != 44) {
          b.a(127);
          if (param11 <= param13) {
            if (param3 <= param13) {
              if (param3 <= param11) {
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                return;
              } else {
                cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                return;
              }
            } else {
              cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
              if (var17 != 0) {
                if (param3 > param11) {
                  cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                  return;
                } else {
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (param3 > param11) {
              cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, param15);
              if (var17 != 0) {
                if (param3 <= param13) {
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (var17 != 0) {
                    if (param3 <= param13) {
                      if (param3 <= param11) {
                        cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                        return;
                      } else {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                        cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                        return;
                      }
                    } else {
                      cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                      if (var17 != 0) {
                        if (param3 <= param11) {
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                          return;
                        } else {
                          cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
                  if (var17 != 0) {
                    cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                    if (var17 != 0) {
                      L0: {
                        if (param3 <= param13) {
                          break L0;
                        } else {
                          cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                          if (var17 != 0) {
                            break L0;
                          } else {
                            return;
                          }
                        }
                      }
                      if (param3 > param11) {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                        if (var17 == 0) {
                          return;
                        } else {
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                          return;
                        }
                      } else {
                        cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (param3 > param13) {
                cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
                if (var17 != 0) {
                  L1: {
                    cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                    if (param3 <= param13) {
                      break L1;
                    } else {
                      cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                      break L1;
                    }
                  }
                  L2: {
                    if (param3 <= param11) {
                      break L2;
                    } else {
                      cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                      break L2;
                    }
                  }
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (param3 <= param13) {
                    break L3;
                  } else {
                    cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (param3 <= param11) {
                      break L5;
                    } else {
                      cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                      if (var17 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                  break L4;
                }
                return;
              }
            }
          }
        } else {
          if (param11 <= param13) {
            if (param3 <= param13) {
              if (param3 > param11) {
                cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                if (var17 != 0) {
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                  return;
                } else {
                  return;
                }
              } else {
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                return;
              }
            } else {
              L6: {
                L7: {
                  cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                  if (param3 <= param11) {
                    break L7;
                  } else {
                    cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                    if (var17 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                break L6;
              }
              return;
            }
          } else {
            L8: {
              if (param3 <= param11) {
                break L8;
              } else {
                cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, param15);
                if (var17 != 0) {
                  break L8;
                } else {
                  return;
                }
              }
            }
            if (param3 > param13) {
              cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
              if (var17 != 0) {
                L9: {
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (param3 <= param13) {
                    break L9;
                  } else {
                    cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                    break L9;
                  }
                }
                L10: {
                  if (param3 <= param11) {
                    break L10;
                  } else {
                    cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                    break L10;
                  }
                }
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
                return;
              } else {
                return;
              }
            } else {
              L11: {
                cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                if (param3 <= param13) {
                  break L11;
                } else {
                  cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                  break L11;
                }
              }
              L12: {
                if (param3 <= param11) {
                  break L12;
                } else {
                  cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                  break L12;
                }
              }
              cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
              return;
            }
          }
        }
    }

    final static boolean b(int param0) {
        if (param0 == 0) {
          if (null != oi.field_c) {
            if (!gj.field_k.a(-2)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = -27;
          if (null != oi.field_c) {
            if (!gj.field_k.a(-2)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        ng var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var2 = new ng(param0);
          var3 = var2.h(255);
          var4 = var2.b((byte) 127);
          if (param1 < (var4 ^ -1)) {
            break L0;
          } else {
            L1: {
              if (0 == w.field_g) {
                break L1;
              } else {
                if (w.field_g >= var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if ((var3 ^ -1) != -1) {
              L2: {
                var5 = var2.b((byte) 126);
                if (-1 < (var5 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (-1 == (w.field_g ^ -1)) {
                      break L3;
                    } else {
                      if ((w.field_g ^ -1) > (var5 ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6 = new byte[var5];
                    if (var3 == 1) {
                      break L4;
                    } else {
                      var7 = (Object) (Object) qg.field_s;
                      synchronized (var7) {
                        L5: {
                          qg.field_s.a(var6, var2, -19515);
                          break L5;
                        }
                      }
                      if (CrazyCrystals.field_B == 0) {
                        return var6;
                      } else {
                        break L4;
                      }
                    }
                  }
                  int discarded$2 = di.a(var6, var5, param0, var4, 9);
                  return var6;
                }
              }
              throw new RuntimeException();
            } else {
              var5_ref_byte__ = new byte[var4];
              var2.a(var4, var5_ref_byte__, (byte) -58, 0);
              return var5_ref_byte__;
            }
          }
        }
        throw new RuntimeException();
    }

    private final void a(long param0, int param1) {
        ib var4 = null;
        var4 = (ib) (Object) ((b) this).field_e.a(param0, -117);
        this.a(98, var4);
        if (param1 <= -66) {
          return;
        } else {
          b.a(6, -67, 121, -107, 106, -115, -66, 114, 26, -103, -124, 35, 74, -126, 34, 60);
          return;
        }
    }

    final void a(Object param0, int param1, long param2) {
        this.a(param0, param1, (byte) 60, param2);
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Select Level";
        field_d = "Arcade Levels";
    }
}
