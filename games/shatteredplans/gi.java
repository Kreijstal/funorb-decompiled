/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_a;
    static String field_b;

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hb.a(param0, -31654)) {
            return false;
          }
          if (IntrusiveDeque.a(param0, (byte) 24)) {
            return false;
          }
          if (cg.a(-92, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (va.a(param2, param1 + 12075, param0)) {
            return false;
          }
          if (param1 != -12076) {
            return true;
          }
          if (ms.a(param0, (byte) -53, param2)) {
            return false;
          }
          if (!na.a(param0, 127, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("gi.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        lm[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        sq var2 = null;
        sq var3 = null;
        int var4 = 0;
        lm[] var5 = null;
        int var6 = 0;
        int var2_intLifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (hm.field_q == WeightedLruCache.field_g) {
            if (null != WeightedLruCache.field_g) {
              te.field_c = te.field_c + 16;
              var5 = WeightedLruCache.field_g.field_f;
              var1 = var5;
              if (var1 != null) {
                for (var2_int = 0; var5.length > var2_int; var2_int++) {
                  if (0 == ClientException.field_f[var2_int] &&
                    WidgetStyle.a(var5[var2_int].field_c, (byte) -125)) {
                    ClientException.field_f[var2_int] = 1;
                    BattleSnapshot.a(0);
                  }
                }
              }
            }
          } else {
            fieldTemp$0 = BufferedCacheFile.field_m + 1;
            BufferedCacheFile.field_m = BufferedCacheFile.field_m + 1;
            if (fieldTemp$0 >= 32) {
              js.a((byte) -10);
            }
          }
          if (param0) {
            return;
          }
          if (sr.a(0, "unplaced")) {
            if (SocketArchiveNetworkClient.a("unplaced", -126)) {
              DefendTask.a(1, n.a("unplaced", -21502));
            }
          } else {
            if (sr.a(0, "losegame")) {
              DefendTask.a(1, n.a("lose", -21502));
            }
          }
          aj.field_a.clear(0);
          if (WeightedLruCache.field_g == hm.field_q) {
            ei.field_e = kp.field_j;
            e.field_f = ArchiveRequest.field_r;
            ByteArrayNode.field_k = be.field_h;
            AttackTask.field_o = DerelictMapGenerator.field_q;
          } else {
            e.field_f = QuickChatCategoryRegistry.a(ArchiveRequest.field_r, 32, BufferedCacheFile.field_m, MenuButton.field_B, 0);
            ByteArrayNode.field_k = QuickChatCategoryRegistry.a(be.field_h, 32, BufferedCacheFile.field_m, oi.field_a, 0);
            ei.field_e = QuickChatCategoryRegistry.a(kp.field_j, 32, BufferedCacheFile.field_m, jb.field_d, 0);
            stackIn_28_0 = DerelictMapGenerator.field_q;
            stackIn_28_1 = 32;
            AttackTask.field_o = QuickChatCategoryRegistry.a(stackIn_28_0, stackIn_28_1, BufferedCacheFile.field_m, SliderPainter.field_b, 0);
          }
          if (null != oi.field_i) {
            var1_int = 1;
            var6 = 0;
            var2_intLifetime1 = var6;
            while (var6 < ClientException.field_f.length) {
              if (ClientException.field_f[var6] > 0) {
                ClientException.field_f[var6] = ClientException.field_f[var6] + 1;
              }
              if (ClientException.field_f[var6] < 48) {
                var1_int = 0;
              }
              var6++;
            }
            if (var1_int != 0) {
              var2 = WeightedLruCache.field_g.field_l;
              if (var2 == null &&
                ImageProducerRasterBuffer.field_i > 0) {
                fieldTemp$1 = ImageProducerRasterBuffer.field_i - 1;
                ImageProducerRasterBuffer.field_i = ImageProducerRasterBuffer.field_i - 1;
                var2 = js.field_b[fieldTemp$1];
              }
              if (!is.field_b) {
                MenuList.a(1546006977, var2);
                return;
              }
              is.field_b = false;
              var3 = js.field_b[ImageProducerRasterBuffer.field_i];
              if (var3 != null &&
                var3 != WeightedLruCache.field_g) {
                MenuList.a(1546006977, var3);
                return;
              }
              MenuList.a(1546006977, var2);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "gi.C(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, ms param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          qn.field_b[0] = na.field_u.nextInt();
          qn.field_b[1] = na.field_u.nextInt();
          eo.field_cb.position = 0;
          qn.field_b[3] = (int)Dialog.field_I;
          qn.field_b[2] = (int)(Dialog.field_I >> 32);
          eo.field_cb.writeInt(11135, qn.field_b[0]);
          eo.field_cb.writeInt(11135, qn.field_b[1]);
          eo.field_cb.writeInt(11135, qn.field_b[2]);
          eo.field_cb.writeInt(11135, qn.field_b[3]);
          QuickChatPhraseRegistry.a(24, eo.field_cb);
          if (param3 > -36) {
            return;
          }
          eo.field_cb.writeShort(param0, 255);
          param4.a(eo.field_cb, (byte) 118);
          js.field_f.position = 0;
          if (param1) {
            js.field_f.writeByte(18, (byte) -106);
          } else {
            js.field_f.writeByte(16, (byte) -89);
          }
          js.field_f.position = js.field_f.position + 2;
          var5_int = js.field_f.position;
          js.field_f.writeInt(11135, e.field_b);
          js.field_f.writeLong(-16426, be.field_l);
          var6 = 0;
          if (DualLinkDeque.field_b) {
            var6 = var6 | 1;
          }
          if (StandardAi.field_a) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (fr.field_H != null) {
            var6 = var6 | 16;
          }
          js.field_f.writeByte(var6, (byte) -93);
          var7 = ck.a((byte) 70, GameScreen.getHostApplet((byte) 125));
          if (var7 == null) {
            var7 = "";
          }
          js.field_f.writeString(var7, (byte) 0);
          if (fr.field_H != null) {
            js.field_f.writeMarkedString((byte) 95, fr.field_H);
          }
          GarrisonTask.a(25050, js.field_f, hr.field_a, eo.field_cb, jl.field_V);
          js.field_f.patchLengthShort(-549342136, js.field_f.position - var5_int);
          d.$cfr$intArgs$a$a6964d7afeb1(-1, 82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("gi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
          String var2 = (String) null;
          gi.a((String) null, -107, (String) null);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Select destination system in the same territory or connected by hyperspace link.";
    }
}
