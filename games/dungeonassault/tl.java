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
        var2 = param1;
        if (var2 != 32) {
          if (var2 != 160) {
            if (95 != var2) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (93 != var2) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (192 != var2) {
                                  if (193 != var2) {
                                    if (var2 != 194) {
                                      if (196 != var2) {
                                        if (195 != var2) {
                                          if (var2 != 232) {
                                            if (var2 != 233) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (var2 != 200) {
                                                    if (201 == var2) {
                                                      return 'e';
                                                    } else {
                                                      if (202 != var2) {
                                                        if (var2 != 203) {
                                                          if (var2 != 237) {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (var2 != 205) {
                                                                  if (var2 != 206) {
                                                                    if (207 == var2) {
                                                                      return 'i';
                                                                    } else {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (var2 != 244) {
                                                                            if (246 != var2) {
                                                                              if (var2 != 245) {
                                                                                if (210 != var2) {
                                                                                  if (var2 != 211) {
                                                                                    if (212 != var2) {
                                                                                      if (var2 != 214) {
                                                                                        if (var2 != 213) {
                                                                                          if (var2 != 249) {
                                                                                            if (250 != var2) {
                                                                                              if (var2 != 251) {
                                                                                                if (252 != var2) {
                                                                                                  if (var2 != 217) {
                                                                                                    if (var2 != 218) {
                                                                                                      if (219 != var2) {
                                                                                                        if (var2 != 220) {
                                                                                                          if (var2 != 231) {
                                                                                                            if (var2 == 199) {
                                                                                                              return 'c';
                                                                                                            } else {
                                                                                                              if (var2 != 255) {
                                                                                                                if (var2 != 376) {
                                                                                                                  if (241 != var2) {
                                                                                                                    if (var2 == 209) {
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
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
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
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'i';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param1;
                    }
                  } else {
                    return param1;
                  }
                } else {
                  return param1;
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
        } else {
          return '_';
        }
    }

    final ec c(int param0) {
        if (((tl) this).field_a != param0) {
            return null;
        }
        return ((tl) this).field_j;
    }

    public static void a() {
        field_k = null;
        field_c = null;
        field_e = null;
        field_i = null;
        field_m = null;
    }

    protected final void finalize() {
        if (!(null == ((tl) this).field_g)) {
            if (((tl) this).field_g.field_f != null) {
                try {
                    ((DataInputStream) ((tl) this).field_g.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((tl) this).field_g = null;
        }
        if (!(null == ((tl) this).field_n)) {
            if (null != ((tl) this).field_n.field_f) {
                try {
                    ((java.net.Socket) ((tl) this).field_n.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((tl) this).field_n = null;
        }
        if (null != ((tl) this).field_o) {
            try {
                ((tl) this).field_o.close();
            } catch (Exception exception) {
            }
            ((tl) this).field_o = null;
        }
        ((tl) this).field_b = null;
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
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DungeonAssault.field_K;
            try {
              L0: while (true) {
                L1: {
                  if (((tl) this).field_j.field_m.length <= ((tl) this).field_j.field_o) {
                    break L1;
                  } else {
                    var1_int = ((tl) this).field_o.read(((tl) this).field_j.field_m, ((tl) this).field_j.field_o, -((tl) this).field_j.field_o + ((tl) this).field_j.field_m.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((tl) this).field_j.field_o = ((tl) this).field_j.field_o + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((tl) this).field_j.field_m.length == ((tl) this).field_j.field_o) {
                  throw tl.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((tl) this).field_j.field_m.length + " " + ((tl) this).field_h));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((tl) this).finalize();
                      ((tl) this).field_a = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((tl) this).finalize();
                  ((tl) this).field_a = ((tl) this).field_a + 1;
                  break L3;
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
        if (((tl) this).field_a >= 2) {
          return true;
        } else {
          L0: {
            if (0 == ((tl) this).field_a) {
              L1: {
                if (null != ((tl) this).field_g) {
                  break L1;
                } else {
                  ((tl) this).field_g = ((tl) this).field_f.a(-18, ((tl) this).field_h);
                  break L1;
                }
              }
              if (((tl) this).field_g.field_c == 0) {
                return false;
              } else {
                if (((tl) this).field_g.field_c == 1) {
                  break L0;
                } else {
                  ((tl) this).field_g = null;
                  ((tl) this).field_a = ((tl) this).field_a + 1;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (((tl) this).field_a == 1) {
              L3: {
                if (null != ((tl) this).field_n) {
                  break L3;
                } else {
                  ((tl) this).field_n = ((tl) this).field_f.a(-114, 443, ((tl) this).field_h.getHost());
                  break L3;
                }
              }
              if (((tl) this).field_n.field_c != 0) {
                if (((tl) this).field_n.field_c != 1) {
                  ((tl) this).field_n = null;
                  ((tl) this).field_a = ((tl) this).field_a + 1;
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
            if (null != ((tl) this).field_o) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((tl) this).field_a == 0) {
                      ((tl) this).field_o = (DataInputStream) ((tl) this).field_g.field_f;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == ((tl) this).field_a) {
                      var4 = (java.net.Socket) ((tl) this).field_n.field_f;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((tl) this).field_h.getFile() + "\n\n");
                      int discarded$1 = -14553;
                      var3.write(n.a(var5));
                      ((tl) this).field_o = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((tl) this).field_j.field_o = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((tl) this).finalize();
                  ((tl) this).field_a = ((tl) this).field_a + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (((tl) this).field_b != null) {
                    break L9;
                  } else {
                    ((tl) this).field_b = ((tl) this).field_f.a(-21432, 5, (Runnable) this);
                    break L9;
                  }
                }
                if (0 == ((tl) this).field_b.field_c) {
                  return false;
                } else {
                  L10: {
                    if (1 != ((tl) this).field_b.field_c) {
                      ((tl) this).finalize();
                      ((tl) this).field_a = ((tl) this).field_a + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param0 > 13) {
                      break L11;
                    } else {
                      ((tl) this).finalize();
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
          if (((tl) this).field_b != null) {
            if (0 == ((tl) this).field_b.field_c) {
              return false;
            } else {
              L12: {
                if (1 != ((tl) this).field_b.field_c) {
                  ((tl) this).finalize();
                  ((tl) this).field_a = ((tl) this).field_a + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              if (param0 > 13) {
                return false;
              } else {
                ((tl) this).finalize();
                return false;
              }
            }
          } else {
            ((tl) this).field_b = ((tl) this).field_f.a(-21432, 5, (Runnable) this);
            if (0 == ((tl) this).field_b.field_c) {
              return false;
            } else {
              L13: {
                if (1 != ((tl) this).field_b.field_c) {
                  ((tl) this).finalize();
                  ((tl) this).field_a = ((tl) this).field_a + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              if (param0 <= 13) {
                ((tl) this).finalize();
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    tl(qg param0, java.net.URL param1, int param2) {
        try {
            ((tl) this).field_h = param1;
            ((tl) this).field_f = param0;
            ((tl) this).field_j = new ec(param2);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static String b() {
        if (dk.field_c < 2) {
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
        if (!kg.field_b.a(-14354)) {
            return rf.field_L;
        }
        if (!kg.field_b.a(false, "commonui")) {
            return mp.field_c + " - " + kg.field_b.b("commonui", -1) + "%";
        }
        if (!ib.field_b.a(-14354)) {
            return fg.field_m;
        }
        if (!(ib.field_b.a((byte) 59))) {
            return kj.field_m + " - " + ib.field_b.b(100) + "%";
        }
        return p.field_K;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
