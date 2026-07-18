/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wm extends mo {
    static jn field_k;
    static int[] field_j;

    wm() {
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = param0;
        if (var2 != 32) {
          if (160 != var2) {
            if (var2 != 95) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (var2 == 35) {
                      return param0;
                    } else {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (226 != var2) {
                            if (228 != var2) {
                              if (227 != var2) {
                                if (192 != var2) {
                                  if (var2 != 193) {
                                    if (194 != var2) {
                                      if (var2 != 196) {
                                        if (195 == var2) {
                                          return 'a';
                                        } else {
                                          if (var2 != 232) {
                                            if (233 != var2) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (200 != var2) {
                                                    if (201 != var2) {
                                                      if (var2 != 202) {
                                                        if (var2 != 203) {
                                                          if (var2 != 237) {
                                                            if (238 != var2) {
                                                              if (var2 != 239) {
                                                                if (var2 != 205) {
                                                                  if (var2 != 206) {
                                                                    if (var2 != 207) {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (var2 != 244) {
                                                                            if (var2 != 246) {
                                                                              if (245 != var2) {
                                                                                if (var2 != 210) {
                                                                                  if (var2 != 211) {
                                                                                    if (var2 != 212) {
                                                                                      L0: {
                                                                                        if (var2 == 214) {
                                                                                          break L0;
                                                                                        } else {
                                                                                          if (var2 == 213) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            if (var2 != 249) {
                                                                                              if (var2 != 250) {
                                                                                                L1: {
                                                                                                  if (var2 == 251) {
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    if (var2 != 252) {
                                                                                                      if (var2 != 217) {
                                                                                                        if (var2 == 218) {
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          if (var2 != 219) {
                                                                                                            if (var2 != 220) {
                                                                                                              if (var2 != 231) {
                                                                                                                if (var2 == 199) {
                                                                                                                  return 'c';
                                                                                                                } else {
                                                                                                                  if (255 != var2) {
                                                                                                                    if (var2 != 376) {
                                                                                                                      if (241 == var2) {
                                                                                                                        return 'n';
                                                                                                                      } else {
                                                                                                                        if (var2 != 209) {
                                                                                                                          if (var2 != 223) {
                                                                                                                            return Character.toLowerCase(param0);
                                                                                                                          } else {
                                                                                                                            return 'b';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'n';
                                                                                                                        }
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
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
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

    public static void b(int param0) {
        field_k = null;
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[128];
    }
}
