/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends za {
    static String field_i;
    jaclib.memory.heap.NativeHeap field_h;

    public static void b(int param0) {
        if (param0 != -197) {
            return;
        }
        field_i = null;
    }

    final void b(byte param0) {
        ((cp) this).field_h.a();
        if (param0 < 83) {
            cp.b(126);
        }
    }

    cp(int param0) {
        ((cp) this).field_h = new jaclib.memory.heap.NativeHeap(param0);
    }

    final static char a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
          cp.b(64);
          var2 = param1;
          if (var2 != 32) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 != 95) {
                  if (45 != var2) {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (var2 != 93) {
                          if (35 != var2) {
                            L2: {
                              if (var2 != -225) {
                                if (-226 == var2) {
                                  break L2;
                                } else {
                                  if (-227 != (var2 ^ -1)) {
                                    if (var2 == 228) {
                                      break L2;
                                    } else {
                                      if (var2 != -228) {
                                        if (192 != var2) {
                                          if (var2 == -194) {
                                            break L2;
                                          } else {
                                            if (-195 != var2) {
                                              if (-197 != var2) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (var2 != 233) {
                                                        if (var2 != -235) {
                                                          if (var2 != -236) {
                                                            if (-201 != var2) {
                                                              if (-202 != var2) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (-204 == (var2 ^ -1)) {
                                                                    break L3;
                                                                  } else {
                                                                    L4: {
                                                                      if (var2 == 237) {
                                                                        break L4;
                                                                      } else {
                                                                        if ((var2 ^ -1) == -239) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 != -240) {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (-207 == var2) {
                                                                                break L4;
                                                                              } else {
                                                                                if (207 == var2) {
                                                                                  break L4;
                                                                                } else {
                                                                                  if (242 != var2) {
                                                                                    if (-244 != (var2 ^ -1)) {
                                                                                      if (var2 != -245) {
                                                                                        L5: {
                                                                                          if (246 == var2) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (-211 == var2) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (-212 != (var2 ^ -1)) {
                                                                                                  if (var2 == 212) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if ((var2 ^ -1) == -214) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 != var2) {
                                                                                                              if (251 == var2) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 == -253) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (-218 == var2) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (-220 != (var2 ^ -1)) {
                                                                                                                        if (220 != var2) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != -200) {
                                                                                                                              if (-256 == var2) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (var2 != 223) {
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
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
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
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
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
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        }
                                                                      }
                                                                    }
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
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                return 'a';
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
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (var2 != 32) {
            if (var2 != 160) {
              L7: {
                if (var2 != 95) {
                  if (45 != var2) {
                    if (var2 != 91) {
                      L8: {
                        if (var2 != 93) {
                          if (35 != var2) {
                            L9: {
                              if (var2 != -225) {
                                if (-226 != var2) {
                                  if (-227 != (var2 ^ -1)) {
                                    if (var2 == 228) {
                                      break L9;
                                    } else {
                                      if (var2 != -228) {
                                        if (192 != var2) {
                                          if (var2 == -194) {
                                            break L9;
                                          } else {
                                            if (-195 != var2) {
                                              if (-197 != var2) {
                                                if (195 == var2) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    if (232 == var2) {
                                                      break L10;
                                                    } else {
                                                      if (var2 != 233) {
                                                        if (var2 != -235) {
                                                          if (var2 != -236) {
                                                            if (-201 != var2) {
                                                              if (-202 != var2) {
                                                                if (202 == var2) {
                                                                  break L10;
                                                                } else {
                                                                  if (-204 == (var2 ^ -1)) {
                                                                    break L10;
                                                                  } else {
                                                                    L11: {
                                                                      if (var2 == 237) {
                                                                        break L11;
                                                                      } else {
                                                                        if ((var2 ^ -1) == -239) {
                                                                          break L11;
                                                                        } else {
                                                                          if (var2 != -240) {
                                                                            if (var2 == 205) {
                                                                              break L11;
                                                                            } else {
                                                                              if (-207 == var2) {
                                                                                break L11;
                                                                              } else {
                                                                                if (207 == var2) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    if (242 != var2) {
                                                                                      if (-244 != var2) {
                                                                                        if (var2 != -245) {
                                                                                          if (246 == var2) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L12;
                                                                                            } else {
                                                                                              if (-211 == var2) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                if (-212 != var2) {
                                                                                                  if (var2 == 212) {
                                                                                                    break L12;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      if ((var2 ^ -1) == -214) {
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        L13: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L13;
                                                                                                          } else {
                                                                                                            if (250 != var2) {
                                                                                                              if (251 == var2) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (var2 == -253) {
                                                                                                                  break L13;
                                                                                                                } else {
                                                                                                                  if (-218 == var2) {
                                                                                                                    break L13;
                                                                                                                  } else {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (-220 != (var2 ^ -1)) {
                                                                                                                        if (220 != var2) {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 != -200) {
                                                                                                                              if (-256 == var2) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (var2 != 223) {
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
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
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
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L13;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  break L12;
                                                                                                }
                                                                                              }
                                                                                            }
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
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  }
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
                                                  }
                                                  return 'e';
                                                }
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
                                      } else {
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                break L9;
                              }
                            }
                            return 'a';
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      return param1;
                    } else {
                      return param1;
                    }
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              return '_';
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Decline invitation to <%0>'s game";
    }
}
