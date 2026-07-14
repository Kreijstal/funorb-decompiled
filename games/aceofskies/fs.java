/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fs {
    private long field_b;
    private long field_i;
    static long field_a;
    static as field_d;
    private RandomAccessFile field_h;
    static vd field_e;
    static String field_f;
    static int field_c;
    static String field_g;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        field_d = null;
        if (param0 <= 104) {
            fs.a((byte) -17);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((fs) this).field_h)) {
            System.out.println("");
            ((fs) this).a(19260);
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        int var5 = ((fs) this).field_h.read(param3, param2, param0);
        if (!(0 >= var5)) {
            ((fs) this).field_b = ((fs) this).field_b + (long)var5;
        }
        if (param1 != 53) {
            ((fs) this).field_h = (RandomAccessFile) null;
        }
        return var5;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        byte[] var6 = null;
        if ((long)param3 - -((fs) this).field_b > ((fs) this).field_i) {
          ((fs) this).field_h.seek(((fs) this).field_i);
          ((fs) this).field_h.write(1);
          throw new EOFException();
        } else {
          L0: {
            ((fs) this).field_h.write(param0, param1, param3);
            if (param2 >= 5) {
              break L0;
            } else {
              var6 = (byte[]) null;
              int discarded$1 = fs.a(false, -127, (CharSequence) null, (byte[]) null, -72, -17);
              break L0;
            }
          }
          ((fs) this).field_b = ((fs) this).field_b + (long)param3;
          return;
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        ((fs) this).field_h.seek(param0);
        ((fs) this).field_b = param0;
        if (!param1) {
            fs.a((byte) 118);
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 19260) {
            field_d = (as) null;
        }
        if (!(null == ((fs) this).field_h)) {
            ((fs) this).field_h.close();
            ((fs) this).field_h = null;
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
          var6 = param1 + -param5;
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var6 <= var7) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = ((CharSequence) param2).charAt(var7 + param5);
                      if (-1 <= (var8 ^ -1)) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var8) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 == 8364) {
                        break L6;
                      } else {
                        L7: {
                          if (var8 != 8218) {
                            break L7;
                          } else {
                            param3[var7 + param4] = (byte)-126;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var8 != 402) {
                            break L8;
                          } else {
                            param3[param4 + var7] = (byte)-125;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (8222 == var8) {
                            break L9;
                          } else {
                            L10: {
                              if (8230 == var8) {
                                break L10;
                              } else {
                                L11: {
                                  if (8224 != var8) {
                                    break L11;
                                  } else {
                                    param3[param4 - -var7] = (byte)-122;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var8 == 8225) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (710 != var8) {
                                        break L13;
                                      } else {
                                        param3[var7 + param4] = (byte)-120;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (8240 == var8) {
                                        break L14;
                                      } else {
                                        L15: {
                                          if (352 == var8) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (var8 != 8249) {
                                                break L16;
                                              } else {
                                                param3[param4 - -var7] = (byte)-117;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (var8 == 338) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (381 != var8) {
                                                    break L18;
                                                  } else {
                                                    param3[var7 + param4] = (byte)-114;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                L19: {
                                                  if (8216 == var8) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      if (var8 == 8217) {
                                                        break L20;
                                                      } else {
                                                        L21: {
                                                          if (var8 != 8220) {
                                                            break L21;
                                                          } else {
                                                            param3[var7 + param4] = (byte)-109;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                        L22: {
                                                          if (var8 == 8221) {
                                                            break L22;
                                                          } else {
                                                            L23: {
                                                              if (var8 == 8226) {
                                                                break L23;
                                                              } else {
                                                                L24: {
                                                                  if (8211 == var8) {
                                                                    break L24;
                                                                  } else {
                                                                    L25: {
                                                                      if (var8 != 8212) {
                                                                        break L25;
                                                                      } else {
                                                                        param3[param4 + var7] = (byte)-105;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L25;
                                                                        }
                                                                      }
                                                                    }
                                                                    L26: {
                                                                      if (732 == var8) {
                                                                        break L26;
                                                                      } else {
                                                                        L27: {
                                                                          if (var8 != 8482) {
                                                                            break L27;
                                                                          } else {
                                                                            param3[var7 + param4] = (byte)-103;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L27;
                                                                            }
                                                                          }
                                                                        }
                                                                        L28: {
                                                                          if (var8 != 353) {
                                                                            break L28;
                                                                          } else {
                                                                            param3[var7 + param4] = (byte)-102;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L28;
                                                                            }
                                                                          }
                                                                        }
                                                                        L29: {
                                                                          if (var8 == 8250) {
                                                                            break L29;
                                                                          } else {
                                                                            L30: {
                                                                              if (var8 != 339) {
                                                                                break L30;
                                                                              } else {
                                                                                param3[var7 + param4] = (byte)-100;
                                                                                if (0 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L30;
                                                                                }
                                                                              }
                                                                            }
                                                                            L31: {
                                                                              if (var8 == 382) {
                                                                                break L31;
                                                                              } else {
                                                                                L32: {
                                                                                  if (376 == var8) {
                                                                                    break L32;
                                                                                  } else {
                                                                                    param3[var7 + param4] = (byte)63;
                                                                                    if (0 == 0) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      break L32;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                param3[var7 + param4] = (byte)-97;
                                                                                if (0 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L31;
                                                                                }
                                                                              }
                                                                            }
                                                                            param3[var7 + param4] = (byte)-98;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L29;
                                                                            }
                                                                          }
                                                                        }
                                                                        param3[var7 + param4] = (byte)-101;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                    }
                                                                    param3[var7 + param4] = (byte)-104;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L24;
                                                                    }
                                                                  }
                                                                }
                                                                param3[param4 - -var7] = (byte)-106;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L23;
                                                                }
                                                              }
                                                            }
                                                            param3[var7 + param4] = (byte)-107;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        param3[var7 + param4] = (byte)-108;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    param3[var7 + param4] = (byte)-110;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                param3[var7 + param4] = (byte)-111;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            param3[param4 - -var7] = (byte)-116;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        param3[param4 + var7] = (byte)-118;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    param3[param4 + var7] = (byte)-119;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                param3[param4 - -var7] = (byte)-121;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param3[var7 + param4] = (byte)-123;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param3[param4 - -var7] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    param3[param4 - -var7] = (byte)-128;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  param3[param4 - -var7] = (byte)var8;
                  break L2;
                }
                var7++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var6;
          }
        } else {
          return 26;
        }
    }

    fs(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((fs) this).field_h = new RandomAccessFile(param0, param1);
        ((fs) this).field_b = 0L;
        ((fs) this).field_i = param2;
        int var5 = ((fs) this).field_h.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((fs) this).field_h.seek(0L);
                ((fs) this).field_h.write(var5);
            }
        }
        ((fs) this).field_h.seek(0L);
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return 36L;
        }
        return ((fs) this).field_h.length();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Friends can be added in multiplayer<nbsp>games";
        field_d = new as();
    }
}
