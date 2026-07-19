/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl implements Runnable {
    private java.net.URL field_h;
    private int field_a;
    static nh field_k;
    private pn field_g;
    static cn field_i;
    static String[] field_e;
    static String field_c;
    private DataInputStream field_o;
    private ec field_j;
    private pn field_b;
    static String[] field_m;
    private qg field_f;
    private pn field_n;
    static boolean field_l;
    static boolean field_d;

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != -69) {
          field_c = (String) null;
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            L0: {
              if (-161 == (var2 ^ -1)) {
                break L0;
              } else {
                if (95 == var2) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    L1: {
                      if ((var2 ^ -1) != -92) {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (-36 != (var2 ^ -1)) {
                            L2: {
                              if (var2 != 224) {
                                if (-226 != (var2 ^ -1)) {
                                  if (-227 != (var2 ^ -1)) {
                                    if ((var2 ^ -1) != -229) {
                                      if (-228 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (192 != var2) {
                                          if (193 != var2) {
                                            if ((var2 ^ -1) == -195) {
                                              break L2;
                                            } else {
                                              if (196 != var2) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if ((var2 ^ -1) != -234) {
                                                        if ((var2 ^ -1) != -235) {
                                                          if ((var2 ^ -1) == -236) {
                                                            break L3;
                                                          } else {
                                                            if (-201 != (var2 ^ -1)) {
                                                              if (201 == var2) {
                                                                break L3;
                                                              } else {
                                                                if (202 != var2) {
                                                                  if (var2 != 203) {
                                                                    L4: {
                                                                      if (-238 != (var2 ^ -1)) {
                                                                        if ((var2 ^ -1) != -239) {
                                                                          if (var2 != 239) {
                                                                            if ((var2 ^ -1) != -206) {
                                                                              if (-207 != (var2 ^ -1)) {
                                                                                if (207 == var2) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (var2 != 242) {
                                                                                    if ((var2 ^ -1) != -244) {
                                                                                      L5: {
                                                                                        if ((var2 ^ -1) == -245) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (246 != var2) {
                                                                                            if (-246 != (var2 ^ -1)) {
                                                                                              if (210 == var2) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if ((var2 ^ -1) == -212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if ((var2 ^ -1) != -215) {
                                                                                                      if (var2 != 213) {
                                                                                                        if (-250 != (var2 ^ -1)) {
                                                                                                          if (250 != var2) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if (252 != var2) {
                                                                                                                if ((var2 ^ -1) != -218) {
                                                                                                                  L6: {
                                                                                                                    if (-219 == (var2 ^ -1)) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (219 != var2) {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (-232 != (var2 ^ -1)) {
                                                                                                                            if (-200 == (var2 ^ -1)) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (-256 != (var2 ^ -1)) {
                                                                                                                                if (-377 != (var2 ^ -1)) {
                                                                                                                                  if (241 != var2) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (223 != var2) {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  return 'u';
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'o';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              return 'o';
                                                                                            }
                                                                                          } else {
                                                                                            return 'o';
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      return 'o';
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            break L4;
                                                                          }
                                                                        } else {
                                                                          break L4;
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      } else {
                                                        break L3;
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            if (-161 != (var2 ^ -1)) {
              if (95 != var2) {
                if (var2 != 45) {
                  L7: {
                    if ((var2 ^ -1) != -92) {
                      if (93 != var2) {
                        if (-36 != (var2 ^ -1)) {
                          L8: {
                            if (var2 != 224) {
                              if (-226 != (var2 ^ -1)) {
                                if (-227 != (var2 ^ -1)) {
                                  if ((var2 ^ -1) != -229) {
                                    if (-228 == (var2 ^ -1)) {
                                      break L8;
                                    } else {
                                      if (192 != var2) {
                                        if (193 != var2) {
                                          if ((var2 ^ -1) == -195) {
                                            break L8;
                                          } else {
                                            if (196 != var2) {
                                              if (195 == var2) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (var2 != 232) {
                                                    if ((var2 ^ -1) != -234) {
                                                      if ((var2 ^ -1) != -235) {
                                                        if ((var2 ^ -1) == -236) {
                                                          break L9;
                                                        } else {
                                                          if (-201 != (var2 ^ -1)) {
                                                            if (201 == var2) {
                                                              break L9;
                                                            } else {
                                                              if (202 != var2) {
                                                                if (var2 != 203) {
                                                                  L10: {
                                                                    if (-238 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (var2 != 239) {
                                                                          if ((var2 ^ -1) != -206) {
                                                                            if (-207 != (var2 ^ -1)) {
                                                                              if (207 == var2) {
                                                                                break L10;
                                                                              } else {
                                                                                L11: {
                                                                                  if (var2 != 242) {
                                                                                    if ((var2 ^ -1) != -244) {
                                                                                      if ((var2 ^ -1) == -245) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (246 != var2) {
                                                                                          if (-246 != (var2 ^ -1)) {
                                                                                            if (210 == var2) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) == -212) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if (var2 != 213) {
                                                                                                      L12: {
                                                                                                        if (-250 != (var2 ^ -1)) {
                                                                                                          if (250 != var2) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if (252 != var2) {
                                                                                                                if ((var2 ^ -1) != -218) {
                                                                                                                  if (-219 == (var2 ^ -1)) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (219 != var2) {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (-232 != (var2 ^ -1)) {
                                                                                                                          if (-200 == (var2 ^ -1)) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (-256 != (var2 ^ -1)) {
                                                                                                                              if (-377 != (var2 ^ -1)) {
                                                                                                                                if (241 != var2) {
                                                                                                                                  if ((var2 ^ -1) == -210) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if (223 != var2) {
                                                                                                                                      return Character.toLowerCase(param1);
                                                                                                                                    } else {
                                                                                                                                      return 'b';
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L12;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L12;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L12;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L12;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L11;
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L11;
                                                                                          }
                                                                                        } else {
                                                                                          break L11;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  } else {
                                                                                    break L11;
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              break L10;
                                                                            }
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      } else {
                                                                        break L10;
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          return 'a';
                        } else {
                          break L7;
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      break L7;
                    }
                  }
                  return param1;
                } else {
                  return '_';
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    final ec c(int param0) {
        if (this.field_a != param0) {
            return null;
        }
        return this.field_j;
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_e = null;
        field_i = null;
        field_m = null;
        if (param0 != 50) {
            field_i = (cn) null;
        }
    }

    protected final void finalize() {
        if (!(null == this.field_g)) {
            if (this.field_g.field_f != null) {
                try {
                    ((DataInputStream) (this.field_g.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (!(null == this.field_n)) {
            if (null != this.field_n.field_f) {
                try {
                    ((java.net.Socket) (this.field_n.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_n = null;
        }
        if (null != this.field_o) {
            try {
                this.field_o.close();
            } catch (Exception exception) {
            }
            this.field_o = null;
        }
        this.field_b = null;
    }

    final static void a(int param0) {
        if (!(sp.field_c == null)) {
            sp.field_c.c(-6624);
            sp.field_c = null;
        }
        int var1 = 17 / ((param0 - 42) / 58);
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DungeonAssault.field_K;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (this.field_j.field_m.length <= this.field_j.field_o) {
                      break L2;
                    } else {
                      var1_int = this.field_o.read(this.field_j.field_m, this.field_j.field_o, -this.field_j.field_o + this.field_j.field_m.length);
                      if (-1 < (var1_int ^ -1)) {
                        break L2;
                      } else {
                        this.field_j.field_o = this.field_j.field_o + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (this.field_j.field_m.length == this.field_j.field_o) {
                    throw tl.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_m.length + " " + this.field_h));
                  } else {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        this.finalize();
                        this.field_a = 3;
                        break L3;
                      }
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L4: {
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  break L4;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean d(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (this.field_a >= 2) {
          return true;
        } else {
          L0: {
            if (0 == this.field_a) {
              L1: {
                if (null != this.field_g) {
                  break L1;
                } else {
                  this.field_g = this.field_f.a(-18, this.field_h);
                  break L1;
                }
              }
              if (this.field_g.field_c == 0) {
                return false;
              } else {
                if ((this.field_g.field_c ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_g = null;
                  this.field_a = this.field_a + 1;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (-2 == (this.field_a ^ -1)) {
              L3: {
                if (null != this.field_n) {
                  break L3;
                } else {
                  this.field_n = this.field_f.a(-114, 443, this.field_h.getHost());
                  break L3;
                }
              }
              if (this.field_n.field_c != 0) {
                if ((this.field_n.field_c ^ -1) != -2) {
                  this.field_n = null;
                  this.field_a = this.field_a + 1;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != this.field_o) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (this.field_a == 0) {
                      this.field_o = (DataInputStream) (this.field_g.field_f);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == this.field_a) {
                      var4 = (java.net.Socket) (this.field_n.field_f);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
                      var3.write(n.a(var5, -14553));
                      this.field_o = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_j.field_o = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (this.field_b != null) {
                    break L9;
                  } else {
                    this.field_b = this.field_f.a(-21432, 5, (Runnable) (this));
                    break L9;
                  }
                }
                if (0 == this.field_b.field_c) {
                  return false;
                } else {
                  L10: {
                    if (1 != this.field_b.field_c) {
                      this.finalize();
                      this.field_a = this.field_a + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param0 > 13) {
                      break L11;
                    } else {
                      this.finalize();
                      break L11;
                    }
                  }
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          if (this.field_b != null) {
            if (0 == this.field_b.field_c) {
              return false;
            } else {
              L12: {
                if (1 != this.field_b.field_c) {
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              if (param0 <= 13) {
                this.finalize();
                return false;
              } else {
                return false;
              }
            }
          } else {
            this.field_b = this.field_f.a(-21432, 5, (Runnable) (this));
            if (0 == this.field_b.field_c) {
              return false;
            } else {
              L13: {
                if (1 != this.field_b.field_c) {
                  this.finalize();
                  this.field_a = this.field_a + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              if (param0 > 13) {
                return false;
              } else {
                this.finalize();
                return false;
              }
            }
          }
        }
    }

    tl(qg param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param1;
            this.field_f = param0;
            this.field_j = new ec(param2);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String b(int param0) {
        if ((dk.field_c ^ -1) > param0) {
            return to.field_g;
        }
        if (ia.field_U != null) {
            if (!(ia.field_U.a(-14354))) {
                return ec.field_r;
            }
            return ki.field_c;
        }
        if (!fi.field_u.a(-14354)) {
            return qk.field_c;
        }
        if (!fi.field_u.a(false, "commonui")) {
            return sa.field_w + " - " + fi.field_u.b("commonui", -1) + "%";
        }
        if (!kg.field_b.a(param0 ^ 14355)) {
            return rf.field_L;
        }
        if (!kg.field_b.a(false, "commonui")) {
            return mp.field_c + " - " + kg.field_b.b("commonui", param0 ^ 2) + "%";
        }
        if (!ib.field_b.a(param0 + -14351)) {
            return fg.field_m;
        }
        if (!(ib.field_b.a((byte) 59))) {
            return kj.field_m + " - " + ib.field_b.b(100) + "%";
        }
        return p.field_K;
    }

    static {
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_m = new String[]{"Modifiers", "Some things are capable of changing the skill levels of your raider, or a dungeon room. If any of these effects are present on a raider or room, a symbol will be displayed in the corner of its portrait. A <col=00FF00>green</col> symbol means a skill level has <col=00FF00>increased</col>; a <col=FF0000>red</col> symbol indicates a skill level has <col=FF0000>decreased</col>. There are also other symbols you will encounter.<br><br><%command>Continue moving your party towards the hoard room.</col>"};
        field_c = "You must have charged <%0> Orb of Mastery in total to earn the title of <%1>.";
        field_l = true;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
