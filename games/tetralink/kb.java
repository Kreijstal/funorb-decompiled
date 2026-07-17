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
        if (!(param1 != null)) {
            return;
        }
        try {
            gl.field_o = param1;
            ck.field_bb.field_fb.b(1);
            ck.field_bb.a((byte) 112, (hl) (Object) gl.field_o);
            hi.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "kb.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        bm.field_n = param0;
        uj.field_w = param2;
        wa.field_d = param1;
    }

    public static void a() {
        field_q = null;
        field_p = null;
    }

    kb(int param0, boolean param1, int param2) {
        ((kb) this).field_n = param1 ? true : false;
        ((kb) this).field_r = 0;
        ((kb) this).field_s = param2;
        ((kb) this).field_o = param0;
    }

    final static char a(char param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var2 = 1;
        var3 = param0;
        if (var3 != 32) {
          if (var3 != 160) {
            if (var3 != 95) {
              if (var3 != 45) {
                if (var3 != 91) {
                  if (93 != var3) {
                    if (var3 != 35) {
                      if (var3 != 224) {
                        if (225 != var3) {
                          if (var3 != 226) {
                            if (var3 != 228) {
                              if (227 != var3) {
                                if (192 != var3) {
                                  if (193 != var3) {
                                    if (var3 != 194) {
                                      if (var3 != 196) {
                                        if (var3 == 195) {
                                          return 'a';
                                        } else {
                                          if (232 != var3) {
                                            if (var3 != 233) {
                                              if (var3 != 234) {
                                                if (var3 != 235) {
                                                  if (200 != var3) {
                                                    if (201 != var3) {
                                                      if (var3 != 202) {
                                                        if (203 == var3) {
                                                          return 'e';
                                                        } else {
                                                          if (var3 != 237) {
                                                            if (var3 != 238) {
                                                              if (239 != var3) {
                                                                if (205 != var3) {
                                                                  if (var3 != 206) {
                                                                    if (207 != var3) {
                                                                      if (var3 != 242) {
                                                                        if (var3 != 243) {
                                                                          if (var3 != 244) {
                                                                            if (var3 != 246) {
                                                                              if (245 != var3) {
                                                                                if (210 != var3) {
                                                                                  if (var3 != 211) {
                                                                                    if (var3 != 212) {
                                                                                      if (var3 != 214) {
                                                                                        if (213 != var3) {
                                                                                          if (249 != var3) {
                                                                                            if (var3 != 250) {
                                                                                              if (var3 != 251) {
                                                                                                if (var3 != 252) {
                                                                                                  if (var3 != 217) {
                                                                                                    if (var3 != 218) {
                                                                                                      L0: {
                                                                                                        if (var3 == 219) {
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
                                                                                                                  if (var3 != 376) {
                                                                                                                    if (var3 != 241) {
                                                                                                                      if (var3 == 209) {
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
