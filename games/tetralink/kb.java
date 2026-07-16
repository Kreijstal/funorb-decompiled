/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends mc {
    int field_s;
    int field_o;
    int field_r;
    static String field_p;
    boolean field_n;
    static bc field_q;
    static int field_t;

    final static void a(boolean param0, le param1) {
        if (param1 == null) {
          return;
        } else {
          gl.field_o = param1;
          ck.field_bb.field_fb.b(1);
          if (param0) {
            field_t = -13;
            ck.field_bb.a((byte) 112, (hl) (Object) gl.field_o);
            hi.field_a = true;
            return;
          } else {
            ck.field_bb.a((byte) 112, (hl) (Object) gl.field_o);
            hi.field_a = true;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        bm.field_n = param0;
        uj.field_w = param2;
        wa.field_d = param1;
        if (param3 != -118) {
            kb.a(13);
        }
    }

    public static void a(int param0) {
        if (param0 != 111) {
            field_p = null;
            field_q = null;
            field_p = null;
            return;
        }
        field_q = null;
        field_p = null;
    }

    kb(int param0, boolean param1, int param2) {
        ((kb) this).field_n = param1 ? true : false;
        ((kb) this).field_r = 0;
        ((kb) this).field_s = param2;
        ((kb) this).field_o = param0;
    }

    final static char a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var2 = 88 % ((65 - param1) / 58);
        var3 = param0;
        if (var3 != 32) {
          if (-161 != (var3 ^ -1)) {
            if ((var3 ^ -1) != -96) {
              if (-46 != (var3 ^ -1)) {
                if (var3 != 91) {
                  if (93 != var3) {
                    if ((var3 ^ -1) != -36) {
                      if (var3 != 224) {
                        if (225 != var3) {
                          if ((var3 ^ -1) != -227) {
                            if (var3 != 228) {
                              if (227 != var3) {
                                if (192 != var3) {
                                  if (193 != var3) {
                                    if (-195 != (var3 ^ -1)) {
                                      if ((var3 ^ -1) != -197) {
                                        if (-196 == (var3 ^ -1)) {
                                          return 'a';
                                        } else {
                                          if (232 != var3) {
                                            if ((var3 ^ -1) != -234) {
                                              if (var3 != 234) {
                                                if ((var3 ^ -1) != -236) {
                                                  if (200 != var3) {
                                                    if (201 != var3) {
                                                      if ((var3 ^ -1) != -203) {
                                                        if (203 == var3) {
                                                          return 'e';
                                                        } else {
                                                          if (var3 != 237) {
                                                            if (-239 != (var3 ^ -1)) {
                                                              if (239 != var3) {
                                                                if (205 != var3) {
                                                                  if (var3 != 206) {
                                                                    if (207 != var3) {
                                                                      if (-243 != (var3 ^ -1)) {
                                                                        if (-244 != (var3 ^ -1)) {
                                                                          if (-245 != (var3 ^ -1)) {
                                                                            if (var3 != 246) {
                                                                              if (245 != var3) {
                                                                                if (210 != var3) {
                                                                                  if (var3 != 211) {
                                                                                    if (var3 != 212) {
                                                                                      if (-215 != (var3 ^ -1)) {
                                                                                        if (213 != var3) {
                                                                                          if (249 != var3) {
                                                                                            if ((var3 ^ -1) != -251) {
                                                                                              if (-252 != (var3 ^ -1)) {
                                                                                                if (-253 != (var3 ^ -1)) {
                                                                                                  if (var3 != 217) {
                                                                                                    if (-219 != (var3 ^ -1)) {
                                                                                                      L0: {
                                                                                                        if (-220 == (var3 ^ -1)) {
                                                                                                          break L0;
                                                                                                        } else {
                                                                                                          if (var3 == 220) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            if (var3 == 231) {
                                                                                                              return 'c';
                                                                                                            } else {
                                                                                                              if (199 != var3) {
                                                                                                                if (255 == var3) {
                                                                                                                  return 'y';
                                                                                                                } else {
                                                                                                                  if ((var3 ^ -1) != -377) {
                                                                                                                    if (var3 != 241) {
                                                                                                                      if (-210 == (var3 ^ -1)) {
                                                                                                                        return 'n';
                                                                                                                      } else {
                                                                                                                        if (var3 == 223) {
                                                                                                                          return 'b';
                                                                                                                        } else {
                                                                                                                          return Character.toLowerCase(param0);
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            }
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
                                                            return 'i';
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
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
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
                      return param0;
                    }
                  } else {
                    return param0;
                  }
                } else {
                  return param0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
